package com.pallavi.first_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class recreate_password : AppCompatActivity() {
    lateinit var etpass:EditText
    lateinit var etrepass:EditText
    lateinit var bchange:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recreate_password)

        etpass=findViewById(R.id.etpass)
        etrepass=findViewById(R.id.etpass)
        bchange=findViewById(R.id.bchange)
    }
}