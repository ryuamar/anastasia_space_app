<div align="center">

[English](README.md) · [العربية](README.ar.md)

<img src="https://family.xotaku.com/stella/png/xotaku_logo_100.png" width="48" height="48" alt="">

<h1>Anastasia Space</h1>

The official open-source mobile app for Anastasia Space.

![Status: Early development](https://img.shields.io/badge/status-early_development-5865F2?style=flat-square)
![Android 7.0+](https://img.shields.io/badge/Android-7.0%2B-3DDC84?style=flat-square)
[![License: MPL 2.0](https://img.shields.io/badge/license-MPL_2.0-blue?style=flat-square)](LICENSE)

</div>

### Anastasia, on your phone

Anastasia Space is already live. Its official mobile app is new, open source, and actively being developed here.

The current Android APK works and is ready to try on **Android 7.0+**. It is a **development/debug build**, not a stable release.

**[Download APK](dev/anastasia-space-dev.apk)**

<p align="center">
  <img src="https://anime.xotaku.com/stella/webp/interface/home_hero/480.webp" width="200" alt="">
</p>

## Live origins

<p align="center">
  <a href="https://anime.xotaku.com/">Anastasia Anime</a> &nbsp;·&nbsp;
  <a href="https://family.xotaku.com/">Anastasia Family</a> &nbsp;·&nbsp;
  <a href="https://orbit.xotaku.com/">Anastasia Orbit</a> &nbsp;·&nbsp;
  <a href="https://status.xotaku.com/">Anastasia Pulse</a>
</p>

## The app today

Development is Android-first, built with Capacitor. The current app starts through [Anastasia Family](https://family.xotaku.com/login) and supports **Android 7.0 / API 24 and newer**.

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
