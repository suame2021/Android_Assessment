package com.suame.week_4app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suame.week_4app.databinding.ActivityHomeBinding
import com.suame.week_4app.databinding.ActivityMainBinding
import com.suame.week_4app.databinding.ActivityPhoneAppBinding
import kotlinx.android.synthetic.main.activity_phone_app.*

class PhoneAppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding= ActivityPhoneAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)


        }

        }





