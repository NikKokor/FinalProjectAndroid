package com.example.finalProject.viewmodel

import com.airbnb.epoxy.EpoxyController
import com.example.finalProject.Car.Car
import com.example.finalProject.Car.CarDataFactory
import com.example.finalProject.Car.epoxy.SingleCarModel_

class SingleCarController : EpoxyController(){

    var carItems : List<Car> = CarDataFactory.getCarItems(10)

    init {
        carItems = CarDataFactory.getCarItems(10)
    }

    private var index = 0L

    override fun buildModels() = carItems.forEach{
        SingleCarModel_(it)
            .id(index++)
            .addTo(this)
    }
}