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
        setContentView(binding.root)
        getExtra()
    }
    fun getExtra(){
        var name=intent.extras?.getString("NAME")
        var Adress=intent.extras?.getString("ADDRESS")
        var Email=intent.extras?.getString("Email")
//        var call  = intent.extras?.getString("CALL")
//        var image=intent.extras?.getString("IMAGE")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()




        binding.tvCall.text = name
        binding.tvMessage.text =Email
        binding.tvvideo.text = Adress
        binding.tvName1.text=name
        Picasso.get().load(intent.getStringExtra("image"))
            .resize(200, 200)
            .centerCrop().into(binding.imgperson)


    }
}