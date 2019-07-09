package com.example.fifa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fifa.Adapters.PlayerAdapter
import com.example.fifa.Helper.SimpleMoneyFormatter
import com.example.fifa.Mappers.PlayerMapper
import com.example.fifa.Models.Player

import com.example.fifa.R
import com.example.fifa.arrayOfPlayers
import kotlinx.android.synthetic.main.fragment_load_players_list.view.*

class LoadPlayersList : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_load_players_list, container, false)
        var listOfPlayers = ArrayList(arrayOfPlayers.map { PlayerMapper(SimpleMoneyFormatter()).map(it) })

        val recyclerView = view.recyclerView
        recyclerView.adapter = PlayerAdapter(listOfPlayers, object: PlayerAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                Toast.makeText(context, "Posistion $position", Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }
}