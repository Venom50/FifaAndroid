package com.example.fifa.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.Entities.PlayerEntity
import com.example.fifa.Models.Player
import com.example.fifa.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.player_item.view.*
import org.w3c.dom.Text

class PlayerAdapter(private var players: ArrayList<PlayerEntity>, private val onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        return PlayerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.player_item, parent, false))
    }

    override fun getItemCount(): Int = players.size

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.playerIdView.text = player.id.toString()
        holder.playerNameView.text = player.name
        holder.playerNationalityView.text = player.nationality
        holder.playerAgeView.text = player.age.toString()
        Picasso.get().load(player.photo).resize(100, 100).into(holder.playerImageView)
    }

    inner class PlayerViewHolder(container: View) : RecyclerView.ViewHolder(container) {
        val playerIdView: TextView = container.playerId
        val playerNameView: TextView = container.name
        val playerNationalityView: TextView = container.nationality
        val playerAgeView: TextView = container.age
        val playerImageView: ImageView = container.photoImageView

        init {
            container.setOnClickListener {
                onItemClickListener.onItemClick(adapterPosition)
            }
        }
    }
}