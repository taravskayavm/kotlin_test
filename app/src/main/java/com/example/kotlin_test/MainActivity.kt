package com.example.kotlin_test

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_test.lesson1.City
import com.example.kotlin_test.lesson1.Data
import com.example.kotlin_test.lesson1.Database
import com.example.kotlin_test.lesson1.test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test("")

        val data1 = Data("Москва",10)
        val data2 = data1.copy()
        data2.temperature = 17

        Log.d("mylogs","${data1.temperature}")
        Log.d("mylogs","${data2.temperature}")
        Log.d("mylogs","${data2.equals(data1)}")
        Log.d("mylogs","${Database.getTest()}")

        City(name="newName", temperature=20).test()
    }

}


