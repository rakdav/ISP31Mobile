package com.example.eventsproject.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eventsproject.R
import com.example.eventsproject.adapters.EventAdapter
import com.example.eventsproject.databinding.ActivityMainBinding
import com.example.eventsproject.viewmodel.MainActivityViewModel
import com.example.eventsproject.viewmodel.MainActivityViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val factory = MainActivityViewModelFactory()
        viewModel = ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.eventLayout.layoutManager=LinearLayoutManager(this)
        viewModel.lst.observe(this, Observer {
            binding.eventLayout.adapter=EventAdapter(viewModel,it,this)
        })
        binding.floatingActionButton.setOnClickListener{
            val intent=Intent(applicationContext,EventActivity::class.java)
            startActivity(intent)
        }
    }
}