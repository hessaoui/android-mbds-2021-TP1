package com.gmail.essaoui.tp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.image_view)
        button = findViewById(R.id.myButton)
        button.setOnClickListener(this)
        loadImage(url = "https://goo.gl/gEgYUd")
    }

    override fun onClick(view: View?) {
        val links = listOf(
            "https://www.vectorkhazana.com/assets/images/products/Smelly-Cat.jpg",
            "https://cdn.futura-sciences.com/buildsv6/images/wide1920/6/5/2/652a7adb1b_98148_01-intro-773.jpg",
            "https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg"
        )
        loadImage(links.random())
        Toast.makeText(this, "You click me", Toast.LENGTH_LONG).show()
    }

    private fun loadImage(url: String) {
        Picasso.get()
            .load(url)
            .resize(500, 500)
            .centerCrop()
            .into(imageView)
    }

//      Glide.with(activity = this)
//            .load(string="url")
//            .fallback(R.drawable.ic_launcher_background)
//            .into(imageView)
}
