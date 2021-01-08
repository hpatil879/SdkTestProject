package com.hpatil879.sdktestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun startDashboard() {
        var libraryFuncResult:String = TestFunctionsClass.testFunc("Test String")
            Log.e("Test", "libraryResult :$libraryFuncResult")
            Toast.makeText(this@MainActivity, "called startDasboard",Toast.LENGTH_SHORT).show()
        }

        val runButton: Button =findViewById(R.id.btnRun);
        runButton.setOnClickListener{
            startDashboard()
        }
    }
}