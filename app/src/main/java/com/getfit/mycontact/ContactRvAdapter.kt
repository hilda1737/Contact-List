package com.getfit.mycontact

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.getfit.mycontact.databinding.ContactListIteamBinding
import com.squareup.picasso.Picasso as Picasso1

class ContactRvAdapter (var contactlist:List<Contact>):
RecyclerView.Adapter<contactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
        var binding=ContactListIteamBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return contactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        var currentcontact=contactlist.get(position)
        holder.binding.tvName.text=currentcontact.name
        holder.binding.tvnumber.text=currentcontact.phonenumber
        holder.binding.tvEmail.text=currentcontact.Email
        holder.binding.tvAdress.text=currentcontact.Adress
        Picasso1.get()
            .load(currentcontact.image)

            .resize(200,200)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgcontact)
        val context=holder.itemView.context
          holder.binding.imgcontact.setOnClickListener{
              Toast.makeText(context,"You have clicked",Toast.LENGTH_LONG)
                  .show()
          }
        holder.binding.cvadapter.setOnClickListener{
            val intent=Intent(context,ContactDisplayActivity::class.java)
            intent.putExtra("Name",currentcontact.name)
            intent.putExtra("Email",currentcontact.phonenumber)
            intent.putExtra("ADDRESS",currentcontact.Email)
            intent.putExtra("image",currentcontact.image)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return contactlist.size


    }

}
class  contactViewHolder(val binding: ContactListIteamBinding):
    RecyclerView.ViewHolder(binding.root){


}