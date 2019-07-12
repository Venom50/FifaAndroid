package com.example.fifa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fifa.*
import com.example.fifa.Adapters.PlayerAdapter
import com.example.fifa.Database.PlayerAndUserDatabase
import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Helper.SimpleMoneyFormatter
import com.example.fifa.Mappers.PlayerMapper
import com.example.fifa.Models.Player

import com.example.fifa.Viewmodels.PlayerViewModel
import kotlinx.android.synthetic.main.fragment_load_players_list.view.*

class LoadPlayersList : Fragment() {

    val listOfPlayers = ArrayList<PlayerEntity>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_load_players_list, container, false)
        //var listOfPlayers = ArrayList(arrayOfPlayers.map { PlayerMapper(SimpleMoneyFormatter()).map(it) })

        //val myDb = PlayerAndUserDatabase.getDatabase(context!!.applicationContext)
        //val listOfPlayers = myDb!!.PlayerDao().getAllPlayers()

        val recyclerView = view.recyclerView

        MainActivity.playerViewModel.allPlayers.observe(this, Observer { listOfPlayers.addAll(it) })

        val bundle: Bundle? = Bundle()

        recyclerView.adapter = PlayerAdapter(listOfPlayers, object: PlayerAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                bundle!!.putInt("playerId", listOfPlayers[position].id!!)

                Navigation.findNavController(view).navigate(R.id.action_loadPlayersList_to_playerInfo, bundle)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }
}