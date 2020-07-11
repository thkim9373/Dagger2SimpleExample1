package com.hoony.dagger2simpleexample.dagger2

import com.hoony.dagger2simpleexample.interfaces.A_Heater
import com.hoony.dagger2simpleexample.interfaces.A_Pump
import com.hoony.dagger2simpleexample.interfaces.Heater
import com.hoony.dagger2simpleexample.interfaces.Pump
import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule {

    @Provides
    fun provideHeater(): Heater = A_Heater()

    @Provides
    fun providePump(heater: Heater): Pump = A_Pump(heater)
}