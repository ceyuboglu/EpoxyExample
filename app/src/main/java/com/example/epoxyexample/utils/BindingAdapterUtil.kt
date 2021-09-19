package com.example.epoxyexample.utils

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapterUtil {
    @JvmStatic
    @BindingAdapter("app:LoadImage")
    fun LoadImage(view:ImageView, url:String){
        Glide.with(view.rootView).load(url).into(view)
    }

}