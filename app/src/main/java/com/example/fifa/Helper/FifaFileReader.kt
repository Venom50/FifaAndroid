package com.example.fifa.Helper

import android.content.ContentResolver
import android.net.Uri
import java.io.BufferedReader
import java.io.InputStreamReader

object FifaFileReader{
    fun read(contentResolver: ContentResolver, uri: Uri): ArrayList<String> {
        val file = contentResolver.openInputStream(uri)
        val streamReader = InputStreamReader(file)
        val lines = ArrayList(BufferedReader(streamReader).readLines())
        lines.removeAt(0)
        return lines
    }
}