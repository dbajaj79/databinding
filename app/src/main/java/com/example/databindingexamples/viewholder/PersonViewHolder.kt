package com.example.databindingexamples.viewholder

import android.support.v7.widget.RecyclerView
import com.example.databindingexamples.databinding.ItemPersonBinding
import com.example.databindingexamples.model.Person

class PersonViewHolder(itemPersonBinding: ItemPersonBinding) : RecyclerView.ViewHolder(itemPersonBinding.root) {
    var  itemPersonBinding:ItemPersonBinding
    init {
        this.itemPersonBinding = itemPersonBinding
    }
    fun onBind(person: Person)
    {
        itemPersonBinding.person = person
    }
}