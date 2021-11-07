package com.gmail.essaoui.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gmail.essaoui.activities.databinding.ComputeActivityBinding

class ComputeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ComputeActivityBinding
//    private lateinit var text: TextView
//    private lateinit var clickButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ComputeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCompute.setOnClickListener(this)

//        setContentView(R.layout.compute_activity)
//        clickButton = findViewById(R.id.btn_compute)
//        text = findViewById(R.id.result)
    }

    override fun onClick(view: View?) {
        binding.result.text = (binding.nb1.text.toString().toDouble() + binding.nb2.text.toString().toDouble()).toString()
    }
}
