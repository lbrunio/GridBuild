package com.example.gridbuild.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Topic(

    @StringRes val stringResourceId: Int,
    val number: Int,
    @DrawableRes val imageResourceId: Int


)
