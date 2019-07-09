package com.example.fifa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.Controllers.WordListAdapter
import com.example.fifa.MainActivity

import com.example.fifa.R
import com.example.fifa.arrayOfPlayers
import kotlinx.android.synthetic.main.fragment_load_players_list.view.*

class LoadPlayersList : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var viewAdapter: WordListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_load_players_list, container, false)



//        recyclerView = view.recyclerView
//        viewAdapter = WordListAdapter((activity as MainActivity).baseContext, arrayOfPlayers)
//
//        recyclerView.adapter = viewAdapter
//
//        recyclerView.layoutManager = LinearLayoutManager((activity as MainActivity).baseContext)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        recyclerView = view.recyclerView
//        recyclerView.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = ListAdapter(arrayOfPlayers)
//        }
    }
}
