package com.example.Mamalia.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hewan (
    @StringRes val stringResourceId : Int,
    @DrawableRes val imageResourceId : Int
)