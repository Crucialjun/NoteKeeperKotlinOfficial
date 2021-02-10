package com.example.notekeeperkotlinofficial

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<ExtendedFloatingActionButton>(R.id.fab).setOnClickListener {
            val intent = Intent(this,NoteActivity::class.java)
            startActivity(intent)
        }

        listItems.layoutManager = LinearLayoutManager(this)


        listItems.adapter = NoteRecyclerAdapter(this,DataManager.notes)



    }

    override fun onResume() {
        super.onResume()
        listItems.adapter?.notifyDataSetChanged()
    }
}