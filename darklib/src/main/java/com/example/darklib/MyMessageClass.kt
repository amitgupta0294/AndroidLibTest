package com.example.darklib

import android.content.Context
import android.widget.Toast

class MyMessageClass {
    companion object {
        fun showMessage(message : String, context : Context) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}