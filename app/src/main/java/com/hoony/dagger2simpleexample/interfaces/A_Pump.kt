package com.hoony.dagger2simpleexample.interfaces

import com.hoony.dagger2simpleexample.interfaces.Heater
import com.hoony.dagger2simpleexample.interfaces.Pump

class A_Pump(private val heater: Heater) : Pump {
    override fun pump(): String =
        if (heater.isHot()) {
            "Pumping...\n"
        } else {
            "Heater not hot!!\n"
        }
}