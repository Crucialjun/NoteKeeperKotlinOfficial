package com.example.notekeeperkotlinofficial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<ExtendedFloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        listNotes.adapter =
                ArrayAdapter(
                        this,
                        android.R.layout.simple_list_item_1,
                        DataManager.notes
                )

        listNotes.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(EXTRA_NOTE_POSITION,position)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        (listNotes.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
    }
}