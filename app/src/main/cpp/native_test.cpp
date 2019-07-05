//
// Created by lgd on 2019/7/2.
//

//
//
#include<jni.h>
#include <string>
//宏定义
#define JNISTRING(name)Java_com_wlkj_test_jni_##name
extern "C" JNIEXPORT
jstring JNICALL
JNISTRING(JniTest_getString)(JNIEnv *env, jclass thiz) {
    return env->NewStringUTF("Hello,I from C++");
}
