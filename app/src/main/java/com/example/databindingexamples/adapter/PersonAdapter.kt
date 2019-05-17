package com.example.databindingexamples.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.databindingexamples.R
import com.example.databindingexamples.databinding.ItemPersonBinding
import com.example.databindingexamples.model.Person
import com.example.databindingexamples.viewholder.PersonViewHolder

class PersonAdapter(list:ArrayList<Person>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
     var listPerson:ArrayList<Person>

    init {
        this.listPerson = list
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val personBinding = DataBindingUtil.inflate<ItemPersonBinding>(LayoutInflater.from(p0.context), R.layout.item_person,p0,false)
        return PersonViewHolder(personBinding)

    }

    override fun getItemCount(): Int {

        return listPerson.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val person = listPerson.get(p1)
        if(p0 is PersonViewHolder)
        {
            p0.onBind(person)
        }
    }
}