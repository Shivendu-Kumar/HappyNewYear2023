package com.example.hny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.animation.Animator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_wish_page.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun wishhny(view: View) {
        val name = userInput.editableText.toString()
        val intent = Intent(this, WishPage::class.java)
        intent.putExtra(WishPage.NAME_EXTRA, name)


        startActivity(intent)
        // Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
    }
}