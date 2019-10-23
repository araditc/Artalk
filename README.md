# ArTalk Android Push Notification Plugin
ArTalk is a free push notification service for mobile apps. This plugin makes it easy to integrate your native Android or iOS app with ArTalk.

# Installation
Step 1:
Add it in your root build.gradle at the end of repositories:
``` gradle
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2:
Add the dependency:
```gradle
  implementation 'com.github.araditc:Artalk:1.0.4'
```
# Sample Code
This Code Put Application Class 
```java
Artalk.Initialize(this);
```
New Listener for message
```java
Artalk.getInstance().SetImessage(Imessage imessage);
```
Sample Listener for receive message
```java
public class App extends Application implements Imessage {

    @Override
    public void MessageReceive(Message message) {
        
    }
}
```
```java
//Get Package Name 
String PackageInfo = UtilSdk.getPackageName(this);

//Get Device Name
String DeviceName = UtilSdk.getDeviceName();

//Get Version
String Version = UtilSdk.getVersion(this);

//Get Firebase Token
Observable<String> Token = new UtilSdk().getDeviceToken();
Token.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
	.subscribe(new Observer<String>() {
	    @Override
            public void onSubscribe(Disposable d) {

            }
	    @Override
            public void onNext(String s) {
                Log.i("Token", s);
            }
            @Override
            public void onError(Throwable e) {

            }
            @Override
            public void onComplete() {

            }
	});
	
```
# Change Log
See this repository's release tags for a complete change log of every released version.

# Support
Please visit this repository's Github issue tracker for feature requests and bug reports related specificly to the SDK. For account issues and support please contact ArTalk support from the cp.arad-itc.com dashboard.

# Demo Project
To make things easier, we have published demo projects in the /Examples folder of this repository.

# Supports:
Tested from Android 4.1 (API level 16) to Android 9.0 (28)
