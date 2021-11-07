package com.gmail.essaoui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gmail.essaoui.activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var nbClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            binding.btnClickMe.setOnClickListener(this@MainActivity)
            binding.computeButton.setOnClickListener(this@MainActivity)
            binding.computeButton.setOnClickListener {
                val intent = Intent(baseContext, ComputeActivity::class.java)
                startActivity(intent)
            }
        }
//            nbClick++
//            val newText = "Click Here $nbClick"
//            clickButton.text = newText
//            val rep = "You have clicked $nbClick times"
//            text.text = rep
//            if (nbClick > 5) {
//                clickButton.isEnabled = false
//            }
    }

    @SuppressLint("StringFormatInvalid")
    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_click_me -> {
                nbClick++
                binding.textView.text = getString(R.string.you_click, nbClick)
                binding.btnClickMe.isEnabled = nbClick <= 4
            }
            R.id.compute_button -> {
                Toast.makeText(this, "", Toast.LENGTH_LONG).show()
            }

            else -> {
            }
        }
    }
}
