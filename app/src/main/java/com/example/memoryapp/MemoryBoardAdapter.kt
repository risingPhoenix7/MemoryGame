package com.example.memoryapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int)
    : RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>()
//instead of subclass being RecyclerView.ViewHolder , we created a subclass called ViewHolder and them
//put that as subclass
{
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
