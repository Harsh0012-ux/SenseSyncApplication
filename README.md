

# SenseSync : Sensor Visualizer in Jetpack Compose


[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=for-the-badge)](https://android-arsenal.com/api?level=24) ![Compose Version](https://img.shields.io/badge/Compose-1.2.0-brightgreen?style=for-the-badge)

> Help in analysing your Android phone's sensors with graphs and visuals.


![sensesync](https://github.com/Harsh0012-ux/SenseSyncApplication/assets/75172541/8241b3d3-4e22-4456-b9eb-56d774ada3dc)





## Feature Roadmap
- 2022: configure sensor delay
- 2023: Beautiful Visuals of for each sensors.


## Goals
- A very good UI for user to interact.
- Use of android sensors for different utilities.
- [Use Cases](https://github.com/JunkieLabs/sensify-android/wiki/Use-Cases)

## Features:

Whole sensors functionality is implemented inside domain folder, where SensorProvider used for listing available sensors and SensorPacketProvider for get packets .

* Realtime **sensor outputs** into charts.
* Implemented in Jetpack Compose.
* MVVM Architecture used for this App.
* Usage of Kotlin Flow, Jetpack State, Singletons etc.
* Theming in M3 for Light and Dark.

## Tech Stack

This project takes advantage of best practices of common libraryies and tools in android.

* [Kotlin](https://kotlinlang.org/)  
* [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - for background operations  
* [Flow](https://developer.android.com/kotlin/flow) - alternate of RxJava
* [Jetpack Compose](https://developer.android.com/jetpack/compose)
* [Jetpack libraries](https://developer.android.com/jetpack):
   * [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) - in-app navigation
   * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform an action when lifecycle state changes
   * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way
* [Material Design 3](https://m3.material.io/develop/android/jetpack-compose) 






