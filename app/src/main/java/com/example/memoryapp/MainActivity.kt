package com.example.memoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.BoardSize

class MainActivity : AppCompatActivity() {

    private lateinit var rvBoard : RecyclerView
    private lateinit var tvNumMoves:TextView
    private lateinit var tvNumPairs : TextView
    //lateinit because they'll be set after on create so saying
    //that when they are used, init them
    private val boardSize:BoardSize=BoardSize.HARD

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvBoard=findViewById(R.id.rvboard)
        tvNumMoves=findViewById(R.id.moves_text)
        tvNumPairs=findViewById(R.id.pairs_text)
        rvBoard.adapter=MemoryBoardAdapter(this,boardSize)  //MemoryBoardAdapter is the new class that adapts data into required format
        rvBoard.setHasFixedSize(true)               //optional, just for efficiency
        rvBoard.layoutManager=GridLayoutManager(this,boardSize.getWidth())
        //layout manager built in function to get a layout of spanCount columns

    }
}