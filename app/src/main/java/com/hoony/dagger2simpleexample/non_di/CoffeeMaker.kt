package com.hoony.dagger2simpleexample.non_di

import com.hoony.dagger2simpleexample.non_di.interfaces.Heater
import com.hoony.dagger2simpleexample.non_di.interfaces.Pump

class CoffeeMaker(
    private val heater: Heater,
    private val pump: Pump
) {
    fun brew(): String {
        var coffeeBrewingStep = ""

        coffeeBrewingStep += heater.on()
        coffeeBrewingStep += "Heater on\n"
        coffeeBrewingStep += pump.pump()
        coffeeBrewingStep += "Pumping\n"
        coffeeBrewingStep += "[_]P coffee! [_]P\n"
        coffeeBrewingStep += heater.off()
        coffeeBrewingStep += "Heater off\n"

        return coffeeBrewingStep
    }
}