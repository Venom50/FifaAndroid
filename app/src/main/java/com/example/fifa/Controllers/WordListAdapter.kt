package com.example.fifa.Controllers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.R

class WordListAdapter


//class WordListAdapter(context: Context, wordList: ArrayList<String>) :
//    RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {
//    var mInflater: LayoutInflater
//    var mWordList: ArrayList<String> = wordList
//
//    init {
//        mInflater = LayoutInflater.from(context)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordListAdapter.WordViewHolder {
//        var mItemView: View = mInflater.inflate(R.layout.wordlist_item, parent, false)
//        return WordViewHolder(mItemView, this)
//    }
//
//    override fun getItemCount(): Int {
//        return mWordList.size
//    }
//
//    override fun onBindViewHolder(holder: WordListAdapter.WordViewHolder, position: Int) {
//        var mCurrent: String = mWordList.get(position)
//        holder.wordItemView.setText(mCurrent)
//    }
//
//    class WordViewHolder(itemView: View, adapter: WordListAdapter) : RecyclerView.ViewHolder(itemView) {
//        var wordItemView: TextView
//        var mAdapter: WordListAdapter
//
//        init {
//            wordItemView = itemView.findViewById(R.id.word)
//            mAdapter = adapter
//        }
//    }
//}