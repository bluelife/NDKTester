#include <jni.h>
#include <string.h>
jstring
Java_com_bluelife_test_ndktest_MainActivity2_setVersion(JNIEnv *env, jobject instance)
{
    return (*env)->NewStringUTF(env, "version"
);
}