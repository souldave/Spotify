package com.example.davegilbier.spotifykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView1)
        mRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val music = ArrayList<Song>()
        music.add(Song("Havana", "Camilla Cabello", " • Havana"))
        music.add(Song("Mercy", "Shawn Mendes", " • Illuminate"))
        music.add(Song("Titibo-tibo", "Moira De La Torre", " • Himig Handog 2017"))
        music.add(Song("Treat You Better", "Shawn Mendes", " • Illuminate"))
        music.add(Song("How Long", "Charlie Puth", " • Alien Boy"))
        music.add(Song("New Rules", "Dua Lipa", " • Single"))
        music.add(Song("Hero", "The Script", " • 3"))
        music.add(Song("Dive", "Ed Sheeran", " • Divide"))
        music.add(Song("Happier", "Ed Sheeran", " • Divide") )
        music.add(Song("Too Good At Goodbyes", "Sam Smith", " • The Thrill of It All"))









        var adapter = AdapterSong(music)
        mRecyclerView.adapter = adapter
    }
}
