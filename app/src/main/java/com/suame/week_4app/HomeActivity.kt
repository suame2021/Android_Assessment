package com.suame.week_4app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suame.week_4app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        binding.btnphoneApp.setOnClickListener(){
    PhoneApp()

        }

    }
    fun PhoneApp(){
        var intent=Intent(this,PhoneAppActivity::class.java)
        startActivity(intent)
    }
}