package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btnGo)
        val edtName = findViewById<EditText>(R.id.edtName)
        val edtAge = findViewById<EditText>(R.id.edtAge)
        val txvOut = findViewById<TextView>(R.id.txvOut)

        btnGo.setOnClickListener(){
            var age = edtAge.text.toString().toInt()

            if(age < 10)
                age *= 7
            if(age > 9)
            {
                while (age > 9)
                {
                    age = age.toString().substring(0,1).toInt() + age.toString().substring(1).toInt()
                }
            }

            txvOut.text = getString(R.string.outputWelcome) +" " +  edtName.text.toString() + getString(R.string.outputLucktext)+" "+ age.toString()


        }
    }
}