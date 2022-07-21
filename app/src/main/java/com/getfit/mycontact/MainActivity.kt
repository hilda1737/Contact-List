package com.getfit.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.getfit.mycontact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
        dispalyContacts()
    }
    fun dispalyContacts(){
        var contact = Contact("Linda","Hildamoraa@gmail.com","0727450674","2344555","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact1= Contact("laura","Hildamoraa@gmail.com","0727450674","2344555","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2= Contact("becky","Hildamoraa@gmail.com","0727450674","2344555","https://images.unsplash.com/photo-1550332781-aecd27f7434f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3= Contact("Sheila","Hildamoraa@gmail.com","0727450674","2344555","https://images.unsplash.com/photo-1589156191108-c762ff4b96ab?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact4= Contact("Fiona","Hildamoraa@gmail.com","0727450674","2344555","https://images.unsplash.com/photo-1508970707-f6426fb47503?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")

        var contactlist= listOf(contact,contact1,contact2,contact4,contact3)
        var contactadapter=ContactRvAdapter(contactlist)
    binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=contactadapter

    }

}