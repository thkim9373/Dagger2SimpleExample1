package com.hoony.dagger2simpleexample.non_di

import com.hoony.dagger2simpleexample.interfaces.Heater
import com.hoony.dagger2simpleexample.interfaces.Pump

class CoffeeMaker(
    private val heater: Heater,
    private val pump: Pump
) {
    fun brew(): String {
        var coffeeBrewingStep = ""

        coffeeBrewingStep += heater.on()
        coffeeBrewingStep += pump.pump()
        coffeeBrewingStep += "[_]P coffee! [_]P\n"
        coffeeBrewingStep += heater.off()

        return coffeeBrewingStep
    }
}