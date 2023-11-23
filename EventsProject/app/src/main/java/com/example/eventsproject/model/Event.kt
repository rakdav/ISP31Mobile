package com.example.eventsproject.model

import android.net.Uri
import java.util.Date
data class Event(var name:String,var date:Date,
            var description:String, var image:Uri)