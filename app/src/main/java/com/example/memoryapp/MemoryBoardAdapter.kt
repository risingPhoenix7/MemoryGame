package com.example.memoryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int)
    : RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>()
//instead of subclass being RecyclerView.ViewHolder , we created a subclass called ViewHolder and them
//put that as subclass
{
        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(position: Int) {
                //NO OPERATIONS HERE
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view =LayoutInflater.from(context).inflate(R.layout.memory_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount()=numPieces

}
