package com.example.loginscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginscreens.constance.Constance
import com.example.loginscreens.databinding.ActivityLoginBinding
import com.example.loginscreens.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    private val isRegistered = intent.getBundleExtra(Constance.REGISTERED_KEY)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}