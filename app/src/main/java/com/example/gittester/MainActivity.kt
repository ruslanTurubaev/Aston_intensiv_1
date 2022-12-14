package com.example.gittester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClickShowToast(view : View){
        Toast.makeText(this, "Some text", Toast.LENGTH_SHORT).show()
    }
}