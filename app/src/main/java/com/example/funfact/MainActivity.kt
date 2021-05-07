package com.example.funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.funfact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var backPressedTime = 0L
    var binding:ActivityMainBinding? = null
    var adapter:FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }


    private fun setUpFact(){
        adapter = FactAdapter(this,DummyData.funFacts)
        binding?.factListview?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        }   else {
            Toast.makeText(applicationContext, "Press again to exit app", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()

    }
}