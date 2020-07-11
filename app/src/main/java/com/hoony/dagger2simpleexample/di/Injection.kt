package com.hoony.dagger2simpleexample.di

import com.hoony.dagger2simpleexample.interfaces.A_Heater
import com.hoony.dagger2simpleexample.interfaces.A_Pump
import com.hoony.dagger2simpleexample.interfaces.Heater
import com.hoony.dagger2simpleexample.interfaces.Pump
import com.hoony.dagger2simpleexample.non_di.CoffeeMaker

class Injection {
    companion object {
        private fun provideHeater(): Heater = A_Heater()
        private fun providePump(heater: Heater): Pump = A_Pump(heater)
        fun provideCoffeeMaker(): CoffeeMaker {
            val heater = provideHeater()
            return CoffeeMaker(heater, providePump(heater))
        }
    }
}