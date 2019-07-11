package com.example.fifa.Fragments


import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.fifa.Database.PlayerAndUserDatabase
import com.example.fifa.Helper.FifaFileReader
import com.example.fifa.Models.Player

import com.example.fifa.R
import com.example.fifa.arrayOfPlayers
import com.example.fifa.db
import kotlinx.android.synthetic.main.fragment_list_of_options.view.*

class ListOfOptions : Fragment() {

    private val fileRequestCode: Int = 4

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_of_options, container, false)

        view.listOfPlayersButton.setOnClickListener {

            pickFile()

            Toast.makeText(this.context, "Database loaded", Toast.LENGTH_SHORT).show()
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

    private fun pickFile() {

        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        intent.type = "text/*"
        startActivityForResult(intent, fileRequestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode == fileRequestCode && resultCode == Activity.RESULT_OK) {
            data?.let { intent ->
                arrayOfPlayers = FifaFileReader.read(context!!.contentResolver, intent!!.data!!)
            }
        }
    }
}
