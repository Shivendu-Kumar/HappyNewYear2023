package com.example.hny

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_wish_page.*

class WishPage : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA= "name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_page)


        val name = intent.getStringExtra(NAME_EXTRA)
        val wish = findViewById<TextView>(R.id.textView)
        val wish1 = findViewById<TextView>(R.id.textView1)
        wish.text= "Happy New Year\n$name!"
        wish1.text= "May the New Year 2023 bring you abundant JOY, PROSPERITY and GOOD HEALTH!"
    }
}