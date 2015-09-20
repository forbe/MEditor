package com.jpou.meditor;

import java.io.File;

import com.jpou.ffmpeg.Transcoding;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;

public class TransService extends Service {

	private static final String TAG = "com.jpou.mditor.TransService";
	private Transcoding mTrans;

	public int onStartCommand(Intent intent, int flags, int startId) {
		final String srcVideo =intent.getStringExtra("srcVideo");
		if (srcVideo != null) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Log.d(TAG, "getPath");
						final String sdDir = Environment
								.getExternalStorageDirectory().toString();
						Log.d(TAG, sdDir);
						mTrans = new Transcoding();
						File srcVideoFile = new File(srcVideo);
						String videoName = srcVideoFile.getName();
						String videoPath = srcVideoFile.getParent();
						int lastDot = videoName.lastIndexOf(".");
						String dstVedio = videoPath + "/" + videoName.substring(0, lastDot+1) + "avi";
						if (mTrans.startTrans(srcVideo, dstVedio)) {
							Log.d(TAG, "Transcoding Success");
						} else {
							Log.d(TAG, "Transcoding Failed");
						}
					} catch (Exception e) {
					}
				}
			}).start();
		}
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
