package io.SenseSync.sensor.domains.sensors

import android.content.Context
import android.hardware.SensorManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext


@Composable
fun sensorManagerProvider(): SensorManager {
    return LocalContext.current.getSystemService(Context.SENSOR_SERVICE) as SensorManager
}