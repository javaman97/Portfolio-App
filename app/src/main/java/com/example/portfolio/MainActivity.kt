package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var skills: Button
        lateinit var work: Button
        lateinit var education: Button
        lateinit var achievements: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        skills= findViewById(R.id.btn_skills)
        work=findViewById(R.id.btn_work)
        education=findViewById(R.id.btn_education)
        achievements=findViewById(R.id.btn_achievements)
        skills.setOnClickListener {
            intent=Intent(this,Skills::class.java)
            startActivity(intent)
        }
        work.setOnClickListener {
            intent=Intent(this,Work::class.java)
            startActivity(intent)
        }
        education.setOnClickListener {
            intent=Intent(this,Education::class.java)
            startActivity(intent)
        }
        achievements.setOnClickListener {
            intent=Intent(this,Achievements::class.java)
            startActivity(intent)
        }
    }
}