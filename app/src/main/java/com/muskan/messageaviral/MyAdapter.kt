package com.muskan.messageaviral

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter ( val context: Activity,val arrayList : ArrayList<user>):
        ArrayAdapter<user>(context,R.layout.singlechat,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.singlechat, null)
        val profiledp = view.findViewById<ImageView>(R.id.img1)
        val username = view.findViewById<TextView>(R.id.name)
        val lstmess = view.findViewById<TextView>(R.id.last)
        val lstTime = view.findViewById<TextView>(R.id.time)

        username.text = arrayList[position].username
        lstmess.text = arrayList[position].lstmess
        lstTime.text = arrayList[position].lstTime
        profiledp.setImageResource(arrayList[position].profiledp)

        return view
    }

}