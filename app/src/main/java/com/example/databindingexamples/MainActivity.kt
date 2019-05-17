package com.example.databindingexamples

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.databindingexamples.adapter.PersonAdapter
import com.example.databindingexamples.databinding.ActivityMainBinding
import com.example.databindingexamples.model.Person

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding:ActivityMainBinding
    lateinit var  personAdapter: PersonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        personAdapter = PersonAdapter(getPersonList())
        activityMainBinding.adapter = personAdapter

    }



    fun getPersonList():ArrayList<Person>
    {
        val person = Person("https://www.imagethink.net/wp-content/uploads/2016/08/01-SDCC-DYBI-072316-ImageThink.jpg","Deepak","35","Moonak","dk@gmail.com","9914216291","Pepal Pvt.Ltd")
        val persons:ArrayList<Person> = ArrayList<Person>()
        for(i in 1..20)
        {
            persons.add(person)
        }

        return persons

    }
}
