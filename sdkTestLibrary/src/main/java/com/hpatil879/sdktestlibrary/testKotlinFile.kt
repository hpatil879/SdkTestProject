package com.hpatil879.sdktestproject

import android.util.Log

class TestFunctionsClass {
    companion object {
        fun testFunc(text: String): String {
            Log.e("Library Func. Log", "TestFunctionsClass called with $text")
            return "Received from library ==> $text"
        }
    }
}