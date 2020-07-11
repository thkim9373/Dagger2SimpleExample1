package com.hoony.dagger2simpleexample.interfaces

import com.hoony.dagger2simpleexample.interfaces.Heater

class A_Heater : Heater {
    private var heating: Boolean = false

    override fun on(): String {
        heating = true

        return "Heater on\n"
    }

    override fun off(): String {
        heating = false

        return "Heater off\n"
    }

    override fun isHot(): Boolean = heating
}