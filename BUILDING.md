# Building Anastasia Space for Android

These steps build the current Android development app from a fresh clone.

## Requirements

- Java 25
- Android SDK API 36
- Android Build Tools 36.1.0

## Build

From the repository root, enter the development project:

```sh
cd dev
```

Install the exact dependency snapshot committed with the project:

```sh
npm ci
```

Synchronize the Android project:

```sh
npx cap sync android
```

Build the debug APK from the Android project directory:

```sh
cd android
./gradlew assembleDebug
```

The APK will be written to:

```text
dev/android/app/build/outputs/apk/debug/app-debug.apk
```

`npm ci` uses the committed `package-lock.json` snapshot for reproducible setup. `dev/package.json` intentionally tracks `latest` because `dev/` follows active development. Running a normal `npm install` later can refresh that snapshot to newer stable Capacitor versions.

`npx cap sync android` regenerates machine-specific Capacitor paths during synchronization. A fresh clone therefore does not need any developer-specific SDK or package paths.
