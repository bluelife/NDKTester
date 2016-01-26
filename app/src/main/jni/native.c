#include <jni.h>
#include <string.h>
jstring
Java_com_bluelife_test_ndktest_mainActivity_SetVersionCode(JNIEnv *env, jobject instance)
{
    return (*env)->NewStringUTF(env, "version"
);
}