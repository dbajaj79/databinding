package com.example.databindingexamples.bindingAdapters

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide


@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}

