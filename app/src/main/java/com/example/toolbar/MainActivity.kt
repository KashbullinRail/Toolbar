package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Что-то написано"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.cloud -> { Toast.makeText(this, "Cloud", Toast.LENGTH_SHORT).show() }
            R.id.copy -> { Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show() }
            R.id.search -> { Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show() }

        }
        return true
    }

}