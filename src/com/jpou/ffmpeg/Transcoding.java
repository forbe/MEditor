package com.jpou.ffmpeg;

public class Transcoding {
	public native boolean startTrans(String input, String output);

	static {
		System.loadLibrary("avutil-54");
		System.loadLibrary("swresample-1");
		System.loadLibrary("avcodec-56");
		System.loadLibrary("swscale-3");
		System.loadLibrary("avformat-56");
		System.loadLibrary("avfilter-5");
		System.loadLibrary("transcoding");
		System.loadLibrary("transcoding");
	}
}
