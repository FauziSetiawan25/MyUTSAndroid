package com.example.myuts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myuts.databinding.ActivityMain2Binding
import com.example.myuts.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding){
            submit.setOnClickListener {
                val name = binding.name.text.toString()
                if (name != ""){
                    val intentToSecondActivity = Intent(this@MainActivity2,
                        MainActivity::class.java)
                    intentToSecondActivity.putExtra("Name", name)
                    startActivity(intentToSecondActivity)
                    Toast.makeText(this@MainActivity2, "You have successfully logged out",
                        Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@MainActivity2, "Enter your first name",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}