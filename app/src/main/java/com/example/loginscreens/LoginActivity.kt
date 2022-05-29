package com.example.loginscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginscreens.constance.Constance
import com.example.loginscreens.databinding.ActivityLoginBinding
import com.example.loginscreens.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val isRegistered = intent.getBooleanExtra(Constance.REGISTERED_KEY, false)
        if (isRegistered) {
            binding.nameTF.visibility = View.GONE
            binding.surnameTF.visibility = View.GONE
            binding.confirmButton.text = "Login"
        }


    }

    fun onClickConfirm(view: View) {
        val login = binding.loginTF.text.toString()
        val password = binding.passwordTF.text.toString()
        val isRegistered = intent.getBooleanExtra(Constance.REGISTERED_KEY, false)

        when (isRegistered) {
            true -> {
                if (login == Constance.username && password == Constance.password) {
                    val i = Intent(this, ProfileActivity::class.java)
                    startActivity(i)
                } else {
                    binding.errorTF.visibility = View.VISIBLE
                }
            }
            false -> {
                val i = Intent(this, ProfileActivity::class.java)
                val name = binding.nameTF.text.toString()
                val surname = binding.surnameTF.text.toString()
                val fullname = name + surname
                i.putExtra(Constance.NAME_KEY, fullname)
                startActivity(i)
            }
        }
    }
}