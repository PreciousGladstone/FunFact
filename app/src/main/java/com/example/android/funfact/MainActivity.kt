package com.example.android.funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.funfact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null
    var adapter : factAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()

    }

    private fun setUpFact(){
        adapter = factAdapter(this , DummyData.funFact)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}