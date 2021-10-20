package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var hiTV: TextView
    private var str: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hiTV= findViewById(R.id.hiTV)

    }

    override fun onStart() {
        str+= "Online\n"
        hiTV.text= str
        super.onStart()
    }

    override fun onStop() {
        val currentDate = SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        str+= "$currentDate\n"
        hiTV.text= str
        super.onStop()
    }
}