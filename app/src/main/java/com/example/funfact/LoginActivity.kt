package com.example.funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private var etmail: EditText? = null
    private var etpassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etmail = findViewById<View>(R.id.email) as EditText
        etpassword = findViewById<View>(R.id.password) as EditText

        val button = findViewById<Button>(R.id.login_btn)
            button.setOnClickListener{

                if (etmail!!.text.toString() == "sammybloom@gmail.com" && etpassword!!.text.toString() == "androidmentor") {
                    startActivity(Intent(this, MainActivity::class.java))
                } else {
                    Toast.makeText(applicationContext, "Input the username and password on the Github Repo", Toast.LENGTH_LONG).show()
                }
            }
    }
}