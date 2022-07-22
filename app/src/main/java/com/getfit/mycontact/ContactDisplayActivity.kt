package com.getfit.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.getfit.mycontact.databinding.ActivityContactDisplayBinding
import com.squareup.picasso.Picasso

class ContactDisplayActivity : AppCompatActivity() {
    lateinit var binding:ActivityContactDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDisplayBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_contact_display)
        getExtra()
    }
    fun getExtra(){
        var name=intent.extras?.getString("Name")
        var adress=intent.extras?.getString("Adres")
        var video=intent.extras?.getString("Video")
        var massages  = intent.extras?.getString("Massages")
        var call  = intent.extras?.getString("call")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
       Toast.makeText(this, massages,Toast.LENGTH_SHORT).show()
        Toast.makeText(this, call,Toast.LENGTH_SHORT).show()
        Toast.makeText(this, video,Toast.LENGTH_SHORT).show()
        Toast.makeText(this, adress,Toast.LENGTH_SHORT).show()



        binding.tvCall.text = name
        binding.tvMessage.text = massages
        binding.tvvideo.text = video
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(200, 200)
            .centerCrop()


    }
}