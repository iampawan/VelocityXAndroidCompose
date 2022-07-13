# VelocityX

<p align="center">
  <a href="https://velocityx.dev/" target="_blank">
    <img src="https://i.imgur.com/bUPGr7s.png"  width="800" alt="VelocityX">
  </a>
</p>
<a href="https://www.producthunt.com/posts/velocityx?utm_source=badge-featured&utm_medium=badge&utm_souce=badge-velocityx" target="_blank"><img src="https://api.producthunt.com/widgets/embed-image/v1/featured.svg?post_id=289488&theme=light" alt="VelocityX - A minimalist framework | Product Hunt" style="width: 250px; height: 54px;" width="250" height="54" /></a>

[![VelocityX](https://img.shields.io/badge/velocityx-fast-red?style=for-the-badge)](https://github.com/iampawan/VelocityXAndroidCompose)

[![GitHub Release Date](https://img.shields.io/github/release-date/iampawan/velocityXandroidcompose.svg?style=for-the-badge)](https://github.com/iampawan/VelocityXAndroidCompose)
[![GitHub issues](https://img.shields.io/github/issues/iampawan/VelocityXAndroidCompose.svg?style=for-the-badge)](https://github.com/iampawan/VelocityXAndroidCompose/issues)
[![GitHub top language](https://img.shields.io/github/languages/top/iampawan/VelocityXAndroidCompose.svg?style=for-the-badge)](https://github.com/iampawan/VelocityXAndroidCompose)

<a href="https://discord.gg/9tXYvNq"><img src="https://img.shields.io/discord/746087597759004835.svg?logo=discord&style=for-the-badge" alt="Discord"></a>

### Show some :heart: and star the repo.

[![GitHub followers](https://img.shields.io/github/followers/iampawan.svg?style=social&label=Follow)](https://github.com/iampawan/)
[![Twitter Follow](https://img.shields.io/twitter/follow/imthepk.svg?style=social)](https://twitter.com/imthepk)

[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)

---

## [Subscribe to Codepur](https://codepur.dev/)

---

[**VelocityX**](https://velocityx.dev/) is a 100% free Jetpack open-source minimalist UI Framework built with <a href="https://developer.android.com/jetpack/compose/" target="_blank">Kotlin & Jetpack Compose</a> to make Android development easier and more joyful than ever.

## Inspired from Tailwindcss and Flutter

```kotlin
"Welcome to VelocityX".text.white.xl4.bold.center.make()
```

---

## Getting started

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

Step 2. Add the dependency

```gradle
dependencies {
	        implementation 'com.github.iampawan:VelocityXAndroidCompose:1.0.0-alpha01'
	}
```

---

## Usage

- Check output by running Example App in Android Studio

<details>
  <summary>Basic Example of VxText</summary>
<pre>

```kotlin
"VxText Example".text.white.xl4.p16.bold.center.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxBox</summary>
<pre>

```kotlin
 VxBox {
    "VxBox Example".text.white.bold.p16.xl2.make()
    }.blue800.wFull().p16.rounded.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxCard</summary>
<pre>

```kotlin
 VxCard {
        "VxCard Example".text.blue800.bold.xl.p20.make()
    }.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxImage</summary>
<pre>

```kotlin
  VxImage(R.drawable.flpy).fit.rounded.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxRow</summary>
<pre>

```kotlin
   VxRow {
            "VxRow Example".text.white.bold.p16.xl2.make()
            WidthBox(20)
            VxImage(R.drawable.flpy).fit.rounded.make()
        }.blue800.rounded.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxColumn</summary>
<pre>

```kotlin
  VxColumn {
            "VxText Example".text.blue800.bold.xl2.make()
            HeightBox(20)
            VxBox {
                "VxBox Example".text.white.bold.p16.xl2.make()
                }.blue800.wFull().p16.rounded.make()
            HeightBox(20)
            VxImage(R.drawable.flpy).fit.roundedLg.make()
            HeightBox(20)
            VxRow {
                "VxRow Example".text.white.bold.p16.xl2.make()
            WidthBox(20)
            VxImage(R.drawable.flpy).fit.rounded.make()
                }.blue800.rounded.make()
            HeightBox(20)
            VxCard {
                "VxCard Example".text.blue800.bold.xl.p20.make()
                }.make()
    }.p16.make()
```

</pre>
</details>

<details>
  <summary>Basic Example of VxSpacer</summary>
<pre>

```kotlin
  VxSpacer().w20().hFull().make()
```

</pre>
</details>

<details>
  <summary>Basic Widgets to give space</summary>
<pre>

```kotlin
  HeightBox(20)
  WidthBox(20)
```

</pre>
</details>

## Project Created & Maintained By

### Pawan Kumar

Google Developer Expert for Flutter. Passionate #Flutter, #Android Developer. #Entrepreneur #YouTuber

<a href="https://play.google.com/store/apps/dev?id=7703305844118303242&hl=en"><img src="https://github.com/aritraroy/social-icons/blob/master/play-store-icon.png?raw=true" width="60"></a> <a href="https://medium.com/@imthepk"><img src="https://github.com/aritraroy/social-icons/blob/master/medium-icon.png?raw=true" width="60"></a>
<a href="https://twitter.com/imthepk"><img src="https://github.com/aritraroy/social-icons/blob/master/twitter-icon.png?raw=true" width="60"></a>
<a href="https://linkedin.com/in/imthepk"><img src="https://github.com/aritraroy/social-icons/blob/master/linkedin-icon.png?raw=true" width="60"></a>
<a href="https://facebook.com/imthepk"><img src="https://github.com/aritraroy/social-icons/blob/master/facebook-icon.png?raw=true" width="60"></a>
<a href="https://instagram.com/codepur_ka_superhero"><img src="https://github.com/aritraroy/social-icons/blob/master/instagram-icon.png?raw=true" width="60"></a>

# Donate

> If you found this project helpful or you learned something from the source code and want to thank me, consider buying me a cup of :coffee:
>
> - [PayPal](https://www.paypal.me/imthepk/)

### Note: VelocityX is not directly and/or indirectly associated/affiliated with Jetbrains or Google LLC.

## Copyright-and-license

Code and documentation Copyright 2022 Pawan Kumar. Code released under the [Apache License](./LICENSE). Docs released under [Creative Commons](https://creativecommons.org/licenses/by/3.0/).
