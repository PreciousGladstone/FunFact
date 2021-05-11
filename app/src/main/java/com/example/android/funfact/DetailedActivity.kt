package com.example.android.funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.funfact.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private var binding : ActivityDetailedBinding? = null
    var logo = 0
    var name : String? = null
    var detail : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        logo = intent.getIntExtra(factAdapter.LOGO_EXTRAs , 0)
        name = intent.getStringExtra(factAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(factAdapter.FACT_EXTRAs)

        setUpFactDetail()

    }

    private fun setUpFactDetail(){
       binding?.detailedTv?.text  = detail
        binding?.logoTv?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}