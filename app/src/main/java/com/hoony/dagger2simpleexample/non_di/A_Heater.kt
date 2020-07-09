package com.hoony.dagger2simpleexample.non_di

import com.hoony.dagger2simpleexample.non_di.interfaces.Heater

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