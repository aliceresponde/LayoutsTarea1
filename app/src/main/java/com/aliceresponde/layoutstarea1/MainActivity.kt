package com.aliceresponde.layoutstarea1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.aliceresponde.layoutstarea1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            dropBoxBtn.setOnClickListener(this@MainActivity)
            flipBoardButton.setOnClickListener(this@MainActivity)
            famousButon.setOnClickListener(this@MainActivity)
        }
        setContentView(binding.root)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.dropBoxBtn -> {
                startActivity(Intent(this, DropBoxActivity::class.java))
            }
            R.id.flipBoardButton -> {
                val activity = FlipBoardActivity::class.java
                startActivity(Intent(this, activity))
            }
            R.id.famousButon -> {
                val activity = FamousFormActivity::class.java
                startActivity(Intent(this, activity))
            }
        }
    }
}