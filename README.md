<div align="center">

[English](README.md) · [العربية](README.ar.md)

<img src="https://anime.xotaku.com/stella/webp/interface/home_hero/480.webp" width="240" alt="">

# Anastasia Space

The official open-source mobile app for Anastasia Space.

![Status: Early development](https://img.shields.io/badge/status-early_development-5865F2?style=flat-square)
![Android 7.0+](https://img.shields.io/badge/Android-7.0%2B-3DDC84?style=flat-square)
[![License: MPL 2.0](https://img.shields.io/badge/license-MPL_2.0-blue?style=flat-square)](LICENSE)

**[Try the development APK](dev/anastasia-space-dev.apk)**

</div>

Anastasia Space is already live. This repository is home to its new mobile app, which is actively being developed. The website and server-side source are separate and are not included here.

## Live origins

<p align="center">
  <a href="https://xotaku.com/"><img src="https://family.xotaku.com/stella/png/xotaku_logo_100.png" width="24" height="24" alt=""> xotaku.com</a> &nbsp;·&nbsp;
  <a href="https://anime.xotaku.com/"><img src="https://anime.xotaku.com/favicon.ico" width="24" height="24" alt=""> Anime</a> &nbsp;·&nbsp;
  <a href="https://family.xotaku.com/"><img src="https://family.xotaku.com/favicon.ico" width="24" height="24" alt=""> Family</a> &nbsp;·&nbsp;
  <a href="https://orbit.xotaku.com/"><img src="https://orbit.xotaku.com/favicon.ico" width="24" height="24" alt=""> Orbit</a> &nbsp;·&nbsp;
  <a href="https://status.xotaku.com/"><img src="https://status.xotaku.com/favicon.ico" width="24" height="24" alt=""> Status</a>
</p>

## The app today

Development is Android-first, built with Capacitor. The current app starts through [Anastasia Family](https://family.xotaku.com/login) and supports **Android 7.0 / API 24 and newer**.

The current development APK is working and installable. The app is still in early development: this is a **debug build for testing**, not an official stable or production release.

### Try the current build

**[Download the latest development/testing APK →](dev/anastasia-space-dev.apk)**

The linked repository file is the current development build. Use it to try the app as its foundation takes shape.

## Direction

F-Droid is the first planned public distribution target, with Google Play planned afterward. iOS support is planned later using the same cross-platform foundation. There is no announced release schedule.

## Source & license

The mobile app source is open source under the **[Mozilla Public License 2.0](LICENSE)**. Anastasia Space’s backend and server-side code are maintained separately; this repository contains the mobile app only.

## Repository structure

| Path | Purpose |
| --- | --- |
| [`dev/`](dev/) | Active development version |
| [`dev/android/`](dev/android/) | Android project |
| [`dev/www/`](dev/www/) | Local Capacitor web entry |
| [`dev/anastasia-space-dev.apk`](dev/anastasia-space-dev.apk) | Current development APK |
| `live/` | Reserved for stable release source later; currently empty |

## Building

Reproducible public build instructions are being prepared before the first tagged release.

## Contributing

The app is actively developed. Questions, issues, and contributions are welcome and will become more useful as the app’s foundation grows.
