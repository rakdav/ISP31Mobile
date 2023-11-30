package com.example.eventsproject.adapters

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.eventsproject.databinding.EventItemBinding
import com.example.eventsproject.model.Event
import com.example.eventsproject.viewmodel.MainActivityViewModel

class EventAdapter(val viewModel: MainActivityViewModel, val arrayList: ArrayList<Event>, val context: Context): RecyclerView.Adapter<EventAdapter.ViewHolder>() {
    private var eventList = ArrayList<Event>()
    class ViewHolder(val binding:EventItemBinding):RecyclerView.ViewHolder(binding.root){}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            EventItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }
    override fun getItemCount(): Int {
        return eventList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.image.setImageBitmap(eventList[position].image as Bitmap);
        holder.binding.tvName.text=eventList[position].name
        holder.binding.tvDate.text=eventList[position].date.toString()
    }
}