# Building Anastasia Space for Android

Run these commands from the repository root to build the Android app from source.

## Requirements

- Java 25
- Node.js and npm
- Android SDK version configured in `android/variables.gradle`
- Android Build Tools version configured in `android/build.gradle`

## Build

Set `JAVA_HOME` and `ANDROID_HOME` to your Java and Android SDK installations if they are not already configured.

Install the dependencies recorded in `package-lock.json`:

```sh
npm ci
```

Synchronize the web assets and Capacitor configuration with the Android project:

```sh
npx cap sync android
```

Build the APK:

```sh
./android/gradlew -p android --no-daemon assembleDebug
```

The output is:

```text
android/app/build/outputs/apk/debug/app-debug.apk
```

This command uses Android's debug build variant. The prebuilt APK included in the repository is [`anastasia-space.apk`](anastasia-space.apk).
