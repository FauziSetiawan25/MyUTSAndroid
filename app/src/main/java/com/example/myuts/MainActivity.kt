package com.example.myuts

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myuts.databinding.ActivityMain2Binding
import com.example.myuts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val name = intent.getStringExtra("Name")

        with(binding){
            binding.nama.text =name

            btnKeluar.setOnClickListener {
                val intentToThirdActivity = Intent(this@MainActivity, MainActivity3::class.java)
                startActivity(intentToThirdActivity)
            }
        }
    }
}