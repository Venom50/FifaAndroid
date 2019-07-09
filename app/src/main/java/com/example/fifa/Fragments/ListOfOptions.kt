package com.example.fifa.Fragments


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation

import com.example.fifa.R
import com.example.fifa.arrayOfPlayers
import kotlinx.android.synthetic.main.fragment_list_of_options.view.*
import kotlin.system.exitProcess

class ListOfOptions : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_of_options, container, false)

        view.listOfPlayersButton.setOnClickListener {

            //CODE ONLY FOR TESTING FUNCTIONALITY
            for (i in 0..5) {
                arrayOfPlayers.add("Player $i")
            }

            Toast.makeText(this.context, "List added", Toast.LENGTH_SHORT).show()
        }

        view.loadPlayersButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_listOfOptions_to_loadPlayersList)
        }

        view.exitButton.setOnClickListener {
            val builder = AlertDialog.Builder(this.context)

            builder.setTitle("Exit")
            builder.setMessage("Are you sure you want to exit?")
            builder.setPositiveButton("Yes") {dialog, which ->
                activity!!.finish()
            }
            builder.setNegativeButton("No") {dialog, which ->
            }

            val dialog: AlertDialog = builder.create()

            dialog.show()
        }

        return view
    }


}
