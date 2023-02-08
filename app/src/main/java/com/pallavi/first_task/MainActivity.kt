package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etusername:EditText
    lateinit var etpassword:EditText
    lateinit var login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etusername=findViewById(R.id.etusername)
        etpassword=findViewById(R.id.etpassword)
        login=findViewById(R.id.login)
        login.setOnClickListener {
            if(etusername.text.isEmpty())
            {
                etusername.error="please enter username"
            }
            else if(etpassword.text.isEmpty())
            {
                etpassword.error="please enter the password"
            }
        }
    }
}
