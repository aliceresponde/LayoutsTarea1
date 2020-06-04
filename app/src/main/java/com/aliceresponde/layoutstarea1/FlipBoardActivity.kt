package com.aliceresponde.layoutstarea1

import android.graphics.Paint
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import androidx.appcompat.app.AppCompatActivity
import com.aliceresponde.layoutstarea1.databinding.ActivityFlickerBardBinding


class FlipBoardActivity : AppCompatActivity(){
    private lateinit var binding: ActivityFlickerBardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlickerBardBinding.inflate(layoutInflater)


        val underLinedText = SpannableString(getString(R.string.tap_to_sign_in))
        underLinedText.setSpan(UnderlineSpan(), 0, underLinedText.length, 0)
        binding.signIn.text = underLinedText
        setContentView(binding.root)
    }
}