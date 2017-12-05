package com.kotlinintrolbta.kleytonsantos.kotlinintrolbta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    private class Student(val name: String, val age: Int);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("kleyton", 25)
        val student1 = Student(name = "kleyton", age = 25)
        val student2 = Student(age = 25, name = "Kleyton")

        val thisAVariable = "This is a variable"

        Log.d("onCreate",thisAVariable)

        for(i in 0..100){
            Log.i("FizBuzz",i.toString())
        }
    }
}
