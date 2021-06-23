package com.example.hiltroomsample.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.hiltroomsample.data.local.entity.PinEntity
import com.example.hiltroomsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpLiveData()

        binding.btnSubmit.setOnClickListener {
            val pin = binding.edittext.text.toString()
            if (!pin.isNullOrEmpty()) {
                viewModel.insertPin(PinEntity(pin))
                setUpLiveData()
            }
        }
    }

    private fun setUpLiveData() {
        viewModel.livePinData.observe(this, Observer {
            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
        })
    }
}