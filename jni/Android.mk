LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := tutorial01
LOCAL_SRC_FILES := tutorial01.c
LOCAL_LDLIBS := -llog -lz 
LOCAL_SHARED_LIBRARIES := libavformat libavcodec libswscale libavutil libavfilter libswresample


include $(CLEAR_VARS)

LOCAL_MODULE    := transcoding
LOCAL_SRC_FILES := com_jpou_ffmpeg_Transcoding.c
LOCAL_LDLIBS := -llog -lz 
LOCAL_SHARED_LIBRARIES := libavformat libavcodec libswscale libavutil libavfilter libswresample



include $(BUILD_SHARED_LIBRARY)
$(call import-module, ffmpeg/android/arm)
