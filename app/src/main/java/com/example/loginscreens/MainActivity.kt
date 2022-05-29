package com.example.loginscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.loginscreens.constance.Constance
import com.example.loginscreens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickSignUp(view: View) {
        val i = Intent(this, LoginActivity::class.java)
        i.putExtra(Constance.REGISTERED_KEY, Constance.notRegistered)
        startActivity(i)
    }

    fun onClickLogin(view: View) {
        val i = Intent(this, LoginActivity::class.java)
        i.putExtra(Constance.REGISTERED_KEY, Constance.isRegistered)
        startActivity(i)
    }
}