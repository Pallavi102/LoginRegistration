package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class otp : AppCompatActivity() {

    lateinit var etotp:EditText
    lateinit var bverify:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        etotp=findViewById(R.id.etotp)
        bverify= findViewById(R.id.bverify)
    }
}