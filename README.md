# ArTalk Android Push Notification Plugin

ArTalk is a free push notification service for mobile apps. This plugin makes it easy to integrate your native Android or iOS app with ArTalk.
# Introduction
This Code Put Application Class 
```java
Artalk.Initialize(context);
```

New Listener for message
```java
Artalk.getInstance().SetImessage(Imessage imessage);
```
Sample Listener for receive message
```java
public Class App extend Application implements Imessage {

    @Override
    public void MessageReceive(Message message) {
        
    }
}
```java


# Installation
See ArTalk's Android Native SDK Setup Guide for documentation.
#Step 1:
Add it in your root build.gradle at the end of repositories:
``` groovy
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```
#Step 2:
Add the dependency:
```groovy
  implementation 'com.github.araditc:Artalk:1.0.4'
```
# API
See ArTalk's Android Native SDK API page for a list of all available methods.

# Change Log
See this repository's release tags for a complete change log of every released version.

# Support
Please visit this repository's Github issue tracker for feature requests and bug reports related specificly to the SDK. For account issues and support please contact ArTalk support from the cp.arad-itc.com dashboard.

# Demo Project
To make things easier, we have published demo projects in the /Examples folder of this repository.

# Supports:
Tested from Android 4.1 (API level 16) to Android 9.0 (28)
