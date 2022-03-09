package com.example.memoryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import models.BoardSize
import kotlin.math.min
import kotlin.math.round
import kotlin.math.roundToInt

class MemoryBoardAdapter(private val context: Context, private val boardSize: BoardSize)
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

        val cardwidth:Int =(parent.width/boardSize.getWidth())
        val cardheight: Int =(parent.height/boardSize.getHeight())
        val sidelength=min(cardheight,cardwidth)
        val margin=round(sidelength*0.05).roundToInt()   //let 10% of size be margin(10 top. 10 bottom)

       val view =LayoutInflater.from(context).inflate(R.layout.memory_card,parent,false)
        val layoutparams=view.findViewById<CardView>(R.id.cardView).layoutParams as ViewGroup.MarginLayoutParams
        layoutparams.height= round(sidelength*0.9).roundToInt()
        layoutparams.width=round(sidelength*0.9).roundToInt()           //0.8 because 0.1 top margin, 0.1 bottom margin
        layoutparams.setMargins(margin,margin,margin,margin)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount()=boardSize.numCards

}
