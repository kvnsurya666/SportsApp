package com.kevinsurya.sportsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )

        // 2- Data source : List of SportModel Objects
        var sportsList : ArrayList<SportModel> = ArrayList()

        val sport1 = SportModel(R.drawable.football, "Football")
        val sport2 = SportModel(R.drawable.basketball, "Basketball")
        val sport3 = SportModel(R.drawable.ping, "Ping Pong")
        val sport4 = SportModel(R.drawable.tennis, "Tennis")
        val sport5 = SportModel(R.drawable.volley, "VolleyBall")

        sportsList.add(sport1)
        sportsList.add(sport2)
        sportsList.add(sport3)
        sportsList.add(sport4)
        sportsList.add(sport5)

        // 3- Adapter
        val adapter = SportsAdapter(sportsList)
        recyclerView.adapter = adapter
    }
}