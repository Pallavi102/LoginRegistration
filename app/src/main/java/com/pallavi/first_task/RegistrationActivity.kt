package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegistrationActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etmail:EditText
    lateinit var etpassword:EditText
    lateinit var etcpassword:EditText
    lateinit var etphone:EditText
    lateinit var create:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        etname=findViewById(R.id.etname)
        etmail = findViewById(R.id.etmail)
        etphone=findViewById(R.id.etphone)
        etpassword=findViewById(R.id.etpassword)
        etcpassword=findViewById(R.id.etcpassword)
        create=findViewById(R.id.create)
        create.setOnClickListener {
        if (etname.text.isEmpty())
        {
            etname.error="please enter username"
        }
        else if (etmail.text.isEmpty())
        {
            etmail.error="please enter your mail"

        }
        else if (etpassword.text.isEmpty())
        {
            etpassword.error="please enter the password"
        }
        else if (etcpassword.text.isEmpty())
        {
            etcpassword.error="please enter the password"
        }
        else if (etphone.text.isEmpty())
        {
            etphone.error="please enter your phone no."
        }
    }
    }
}