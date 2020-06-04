package com.aliceresponde.layoutstarea1

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aliceresponde.layoutstarea1.databinding.ActivityFamousFormBinding

class FamousFormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFamousFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamousFormBinding.inflate(layoutInflater)
        binding.createAccountBtn.setOnClickListener { validateForm() }
        setContentView(binding.root)
    }

    fun validateForm() {
        with(binding) {
            val userEt = nameField.editText as EditText
            val emailEt = emailField.editText as EditText
            val passwordEt = passwordField.editText as EditText

            if (userEt.text.isEmpty()) {
                nameField.error = getString(R.string.empty_field)
                return
            } else if (userEt.text.length < 3) {
                nameField.error = getString(R.string.required_3_chars)
                return
            } else if (emailEt.text.isEmpty() || !emailEt.text.matches(Regex(getString(R.string.email_pattern)))) {
                emailField.error = getString(R.string.no_valid_email)
                return
            }
            else if (passwordEt.text.isEmpty()){
                emailEt.setError(getString(R.string.empty_field))
                return
            }
        }
        Toast.makeText(this, getString(R.string.valid_form), Toast.LENGTH_LONG).show()
    }
}