package com.example.finalProject.Car.epoxy
//package com.airbnb.epoxy.sample


import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.finalProject.R
import com.example.finalProject.Car.Car

@EpoxyModelClass(layout = R.layout.item_list)
abstract class SingleCarModel (@EpoxyAttribute var car: Car) :     EpoxyModelWithHolder<SingleCarModel.CarHolder>(){


    override fun bind(holder: CarHolder) {
        holder.imageView?.setImageResource(car.image)
        holder.titleView?.text = car.title
        holder.descView?.text= car.desc
    }

    inner class CarHolder : KotlinHolder(){

        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val descView by bind<TextView>(R.id.desc)

    }
}