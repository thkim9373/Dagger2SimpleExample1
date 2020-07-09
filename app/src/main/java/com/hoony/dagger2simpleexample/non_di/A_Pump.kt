package com.hoony.dagger2simpleexample.non_di

import com.hoony.dagger2simpleexample.non_di.interfaces.Heater
import com.hoony.dagger2simpleexample.non_di.interfaces.Pump

class A_Pump(private val heater: Heater) : Pump {
    override fun pump(): String =
        if (heater.isHot()) {
            "Pumping...\n"
        } else {
            "Heater not hot!!\n"
        }
}