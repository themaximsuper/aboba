package com.example.study4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.children
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav.setOnItemSelectedListener {
            if (it.itemId == R.id.home1) {
                Toast.makeText(this,nav.menu.children.toList().indexOf(it).toString(), Toast.LENGTH_SHORT).show()
            }

            return@setOnItemSelectedListener true
        }
        button.setOnClickListener() {
            nav.selectedItemId = R.id.second
        }
    }
}