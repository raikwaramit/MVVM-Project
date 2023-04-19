package com.example.mvvmproject.util

import android.content.Context
import android.widget.Toast

// Method to show directly toast.
fun Context.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}