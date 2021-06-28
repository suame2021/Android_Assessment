package com.suame.week_4app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suame.week_4app.databinding.ActivityHomeBinding
import com.suame.week_4app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        binding.btnsubmit.setOnClickListener{
        submit()

        }}
fun submit (){
   var intent=Intent(this, HomeActivity::class.java)
    startActivity(intent)
}
    }
