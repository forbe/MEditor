/** */

#ifndef MEDITOR_COMMON_H
#define MEDITOR_COMMON_H
#include <jni.h>
#include <android/log.h>
#define LOG_TAG "com.jpou.meditor"
#define LOG_LEVEL 10
#define LOGI( ...) {__android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__);}
#define LOGE( ...) {__android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__);}
#endif
