package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var mail: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mail = findViewById(R.id.email)

    }

    fun sign(view: View) {
        if(mail.text.toString().isNotEmpty())
        {
            if(mail.text.toString() == "user12")
            {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Нет такого юзера",
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}