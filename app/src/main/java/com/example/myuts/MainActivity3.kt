package com.example.myuts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myuts.databinding.ActivityMain3Binding
import com.example.myuts.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy { ActivityMain3Binding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}