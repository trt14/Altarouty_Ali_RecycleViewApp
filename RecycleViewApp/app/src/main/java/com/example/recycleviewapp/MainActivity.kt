package com.example.recycleviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.RecycleViewAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_row.*

class MainActivity : AppCompatActivity() {

    lateinit var myText: EditText
    lateinit var CL: ConstraintLayout
    lateinit var myButton: Button

    private val myList = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton = findViewById(R.id.btn)
        myText = findViewById(R.id.input1)
        CL= findViewById(R.id.clMain)
        val myRV = findViewById<RecyclerView>(R.id.rvlist)

        myRV.adapter = RecycleViewAdapter(myList)
        myRV.layoutManager = LinearLayoutManager(this)
        myButton.setOnClickListener { myFunction() }
    }

    private fun myFunction(){

        var dailyTask = myText.text.toString()
        if (dailyTask.isEmpty()){
            Snackbar.make(CL, "Please Enter Your Task" , Snackbar.LENGTH_LONG).show()
        }else {
            myList.add(dailyTask)
        }
    }
}

