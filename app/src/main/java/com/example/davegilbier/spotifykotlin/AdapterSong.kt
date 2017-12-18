package com.example.davegilbier.spotifykotlin

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by Dave Gilbier on 16/12/2017.
 */

class AdapterSong (val list: ArrayList<Song>) : RecyclerView.Adapter<AdapterSong.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.song?.text = list[position].sTitle
        holder?.singer?.text = list[position].sSinger
        holder?.album?.text = list[position].sAlbum
        holder?.linearLayout?.setOnClickListener {
            holder.song.setTextColor(Color.parseColor("#1DB853"))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.songlist, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val song = itemView.findViewById<TextView>(R.id.txtSong)
        val singer = itemView.findViewById<TextView>(R.id.txtSinger)
        val album = itemView.findViewById<TextView>(R.id.txtAlbum)
        val linearLayout = itemView.findViewById<RelativeLayout>(R.id.obj)


    }
}