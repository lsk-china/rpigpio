#include "com_example_demo_GPIO.h"
#include <wiringPi.h>

JNIEXPORT void JNICALL Java_com_example_demo_GPIO_setup(JNIEnv *env, jobject obj) {
    wiringPiSetup();
    pinMode(4, OUTPUT);
}


JNIEXPORT void JNICALL Java_com_example_demo_GPIO_on(JNIEnv *env, jobject obj) {
    digitalWrite(4, HIGH);
}

JNIEXPORT void JNICALL Java_com_example_demo_GPIO_off(JNIEnv *env, jobject obj) {
    digitalWrite(4, LOW);
}
