package com.example.finalProject.Car

import com.example.finalProject.R
import java.util.*

object CarDataFactory{

    //region Random Data Generators
    private val random = Random()

    private val titles = arrayListOf<String>("Toyota", "Mazda", "Mitsubishi")
    private val toyota = arrayListOf<String>("supra", "prius", "crown")
    private val mazda = arrayListOf<String>("bongo", "demio")
    private val mitsubishi = arrayListOf<String>("pajero", "mirage")

    private fun randomTitle() : String {
        val title = random.nextInt(3)
        return titles[title]
    }
    private fun randomToyota() : String {
        val desc = random.nextInt(3)
        return toyota[desc]
    }

    private fun randomMazda() : String {
        val desc = random.nextInt(2)
        return mazda[desc]
    }

    private fun randomMitsubishi() : String {
        val desc = random.nextInt(2)
        return mitsubishi[desc]
    }

    private fun picture(name: String) : Int{

        return when(name) {
            "supra" -> R.drawable.supra
            "prius" -> R.drawable.prius
            "crown" -> R.drawable.crown
            "bongo" -> R.drawable.bongo
            "demio" -> R.drawable.demio
            "pajero" -> R.drawable.pajero
            else -> R.drawable.mirage
        }
    }

    fun getCarItems(count:Int) : List<Car>{
        var carItems = mutableListOf<Car>()
        repeat(count){
            val title = randomTitle()
            var desc = ""
            if (title == "Toyota") {
                desc = randomToyota()
            }
            else if (title == "Mazda") {
                desc = randomMazda()
            }
            else {
                desc = randomMitsubishi()
            }
            var image = picture(desc)
            carItems.add(Car(image,title,desc))
        }
        return carItems
    }
}