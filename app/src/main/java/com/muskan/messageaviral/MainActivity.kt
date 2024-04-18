package com.muskan.messageaviral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listmain)
        val username = arrayOf("Radha","Rashi","Sakshi","Arpita","jhanwi","Astha","Divya","Anisha","Siya","khushi")
        val profiledp = intArrayOf(R.drawable.css,R.drawable.figma,R.drawable.firebase,R.drawable.js,R.drawable.kotlin,R.drawable.reactjs,R.drawable.github,R.drawable.html,R.drawable.mongodb,R.drawable.nodejs)
        val lstmess = arrayOf("call krr","sorry yrr","mujhse ni hoga","bhej rahi huin","hello","kuch bhi pgl","tumse na ek baat karni thi","sukriya sukriya","pata hai aaj kya huwa?","rakhi bandhwa lo")
        val lstTime = arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")

        UserArrayList = ArrayList()

        for (i in username.indices)
        {
            val user=user(profiledp[i],username[i],lstmess[i],lstTime[i])
            UserArrayList.add(user)
        }

        listView.isClickable=true
        listView.adapter=MyAdapter(this,UserArrayList)
    }
}