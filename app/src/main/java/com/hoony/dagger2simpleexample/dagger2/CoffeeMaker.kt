package com.hoony.dagger2simpleexample.dagger2

import com.hoony.dagger2simpleexample.interfaces.Heater
import com.hoony.dagger2simpleexample.interfaces.Pump
import javax.inject.Inject

class CoffeeMaker @Inject constructor(
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