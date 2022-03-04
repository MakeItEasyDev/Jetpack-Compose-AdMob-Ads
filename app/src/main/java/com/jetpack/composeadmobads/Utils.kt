package com.jetpack.composeadmobads

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper

//find the current activity from a composable
fun Context.findActivity(): Activity? = when(this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}