package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import com.example.mvvm.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity(),View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        if (v.id == R.id.btnLogin){
            Toast.makeText(this, "Button funcionando!!!", Toast.LENGTH_SHORT).show()
        }
    }

}