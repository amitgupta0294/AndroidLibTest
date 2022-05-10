package com.example.darklib

import android.content.Context
import android.widget.Toast

class Loader {
    companion object {
        fun showMessage(message : String, context : Context) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}