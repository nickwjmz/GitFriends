package com.example.gitfriends.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.gitfriends.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
/*
    lateinit var view: ViewInterface
    val TAG = "Presenter"
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextSearch: TextInputEditText = findViewById(R.id.tiet_github_search)

        editTextSearch.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
/*
    fun onBind(view :ViewInterface) : ViewInterface {
        this.view = view
    }
*/
}
