package io.SenseSync.sensor.domains.sensors

import android.content.Context
import android.hardware.SensorManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import io.SenseSync.sensor.domains.sensors.provider.ModelSensor
import io.SenseSync.sensor.domains.sensors.provider.SensorsProvider


@Composable
fun  SensorsProviderComposable(): State<List<ModelSensor>> {

    val sensorsFlow =  SensorsProvider.getInstance().mSensorsFlow
    val state1 =
        sensorsFlow
            .collectAsState(initial = listOf<ModelSensor>(ModelSensor(-1, null)) )

    val context = LocalContext.current

    LaunchedEffect(key1 = context){
        val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager

        SensorsProvider.getInstance().setSensorManager(sensorManager).listenSensors()

    }


    return state1
}