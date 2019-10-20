package com.example.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nim = findViewById<EditText>(R.id.Nim)
        val nama= findViewById<EditText>(R.id.Nama)
        val nilai=findViewById<EditText>(R.id.Nilai)

        val save=findViewById<Button>(R.id.button)

        save.setOnClickListener {
            val nims = nim.text.toString()
            val name = nama.text.toString()
            val value : Int = Integer.parseInt(nilai.text.toString())



            val intent =  Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("NIM", nims)
            intent.putExtra("Nama", name)
            intent.putExtra("Nilai", value)

            startActivity(intent)

        }
    }
}
