package com.example.mobilewalletapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class trans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trans)


        var rvtrans = findViewById<RecyclerView>(R.id.rvTrans)
        var transList = listOf(
            trans(""),

        )
    }}