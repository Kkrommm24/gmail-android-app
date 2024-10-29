package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = listOf(
            Email("CodeAcademy", "Flash Sale! 50% off courses", "1:15 PM", "C"),
            Email("Jane Doe", "Meeting schedule update", "12:45 PM", "J"),
            Email("Netflix", "New releases this week!", "11:55 AM", "N"),
            Email("Amazon", "Your recent order has shipped", "10:30 AM", "A"),
            Email("Quora Digest", "Top questions for you", "9:40 AM", "Q"),
            Email("Slack", "Don't miss today's team stand-up", "8:20 AM", "S"),
            Email("Dropbox", "New files shared with you", "7:10 AM", "D"),
            Email("Twitter", "Your weekly summary", "6:00 AM", "T"),
            Email("GitHub", "New comment on your issue", "5:45 AM", "G"),
            Email("Coursera", "Start learning Python today!", "4:30 AM", "C")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}