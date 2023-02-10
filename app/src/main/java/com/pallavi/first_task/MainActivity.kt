package com.pallavi.first_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etusername:EditText
    lateinit var etpassword:EditText
    lateinit var login:Button
    lateinit var tvforget:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvforget=findViewById(R.id.tvforget)
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

            else{
                val intent = Intent(this,RegistrationActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        tvforget.setOnClickListener{

                val intent = Intent(this,RegistrationActivity::class.java)
                startActivity(intent)
                finish()

        }

    }
}
