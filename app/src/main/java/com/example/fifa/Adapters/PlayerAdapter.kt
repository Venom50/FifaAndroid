package com.example.fifa.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.Models.Player
import com.example.fifa.R
import kotlinx.android.synthetic.main.player_item.view.*
import org.w3c.dom.Text

class PlayerAdapter(private val players: ArrayList<Player>) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

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
    }

    class PlayerViewHolder(container: View) : RecyclerView.ViewHolder(container) {
        val playerIdView: TextView = container.playerId
        val playerNameView: TextView = container.name
        val playerNationalityView: TextView = container.nationality
        val playerAgeView: TextView = container.age
    }
}