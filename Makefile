c: src/main/c/native.c src/main/c/com_example_demo_GPIO.h
	gcc src/main/c/native.c -shared -fPIC -I/lib/jvm/java-8-openjdk-armhf/include/linux/ -I/lib/jvm/java-8-openjdk-armhf/include -Isrc/main/c -lwiringPi -o target/libgpiotest.so
java: src/main/java/com/example/demo/*
	mvn package
header: target/classes/com/example/demo/GPIO.class
	cd target/classes
	javah com.example.demo.GPIO
	mv com_example_demo_GPIO.h ../../src/main/c
run: c java
	sudo cp target/libgpiotest.so /usr/lib
	java -jar target/rpitest-0.0.1-SNAPSHOT.jar

