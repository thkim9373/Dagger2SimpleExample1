package com.hoony.dagger2simpleexample.dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoffeeMakerModule::class])
interface CoffeeComponent {

    //provision method
    fun make(): CoffeeMaker

    //member-injection method
    fun inject(coffeeMaker: CoffeeMaker)

//    @Component.Builder
//    interface Builder {
//        fun build(): CoffeeComponent
//
//        fun coffeeMakerModule(coffeeMakerModule: CoffeeMakerModule): Builder
//    }
}