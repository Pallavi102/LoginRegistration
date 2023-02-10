package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class forgetpassword : AppCompatActivity() {
    lateinit var etmail:EditText
    lateinit var botp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        etmail=findViewById(R.id.etmail)
        botp=findViewById(R.id.botp)

    }
}