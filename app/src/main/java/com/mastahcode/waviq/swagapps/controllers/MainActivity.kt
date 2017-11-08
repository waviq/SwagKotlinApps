package com.mastahcode.waviq.swagapps.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mastahcode.waviq.swagapps.R
import com.mastahcode.waviq.swagapps.models.Category
import com.mastahcode.waviq.swagapps.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.id.categoryImage, DataService.categories)

        categoryListView.adapter = adapter
    }
}
