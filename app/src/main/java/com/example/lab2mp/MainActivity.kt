package com.example.lab2mp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lab2mp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var count = 0

        //var btn_increment:Button = findViewById(R.id.btn_increment)
        //var tv_number: TextView = findViewById(R.id.tv_number)

       binding.btnIncrement.setOnClickListener {
           count++
           binding.tvNumber.text = count.toString()
       }



    }
}