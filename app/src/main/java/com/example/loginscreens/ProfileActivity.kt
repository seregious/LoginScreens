package com.example.loginscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginscreens.constance.Constance
import com.example.loginscreens.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(Constance.NAME_KEY)
        var helloText = ""
        if (name == null) {
            helloText = "Sergey"
        } else {
            helloText = name
        }
        binding.textView.text = "${binding.textView.text} ${helloText}"
    }
}