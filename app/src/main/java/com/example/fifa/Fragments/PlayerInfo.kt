package com.example.fifa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.fifa.Models.Player

import com.example.fifa.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_player_info.view.*
import java.text.FieldPosition

class PlayerInfo : Fragment() {

    lateinit var nameTextView: TextView
    lateinit var idTextView: TextView
    lateinit var photoImageView: ImageView
    lateinit var overallTextView: TextView
    lateinit var positionTextView: TextView
    lateinit var clubLogoImageView: ImageView
    lateinit var flagImageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_player_info, container, false)

        var player: Player = arguments!!.get("player") as Player

        nameTextView = view.nameTextView
        idTextView = view.idTextView
        photoImageView = view.photoImageView
        overallTextView = view.overallTextView
        positionTextView = view.positionTextView
        clubLogoImageView = view.clubLogoImageView
        flagImageView = view.flagImageView

        nameTextView.text = player.name
        idTextView.text = player.id.toString()
        Picasso.get().load(player.photo).resize(140, 140).into(photoImageView)
        overallTextView.text = player.overall.toString()
        positionTextView.text = player.position
        Picasso.get().load(player.clubLogo).resize(60, 60).into(clubLogoImageView)
        Picasso.get().load(player.flag).resize(60, 40).into(flagImageView)

        return view
    }


}
