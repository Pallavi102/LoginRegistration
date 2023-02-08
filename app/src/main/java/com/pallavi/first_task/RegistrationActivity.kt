package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RegistrationActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etmail:EditText
    lateinit var etpassword:EditText
    lateinit var etphone:EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        etname=findViewById(R.id.etname)
        etpassword=findViewById(R.id.etpassword)
    }
}