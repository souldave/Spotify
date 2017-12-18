package com.example.davegilbier.spotifykotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Dave Gilbier on 16/12/2017.
 */

    class FragmentSong : Fragment() {

        private val song = ""
        private val album = ""
        private var songs: List<String>? = null
        private var albums: List<String>? = null
        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

            if (savedInstanceState != null) {
                songs = savedInstanceState.getStringArrayList(song)
                albums = savedInstanceState.getStringArrayList(album)
            }
            val end = inflater?.inflate(R.layout.current_song, container, false)
            return end
        }
    }
