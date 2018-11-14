package com.hmorillo.kataloginlogoutkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.joda.time.DateTime

class MainActivity : AppCompatActivity() {

    private var logged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViewActions()
    }

    private fun bindViewActions() {
        loginButton.setOnClickListener { loginWith(usernameEditText.text.toString(), passwordEditText.text.toString()) }
        logoutButton.setOnClickListener { logout() }
    }

    private fun loginWith(user: String, password: String) {
        if(!validateUsername(user)){
            Toast.makeText(this, "The username can't contain ',' '.' or ';'", Toast.LENGTH_LONG).show()
        }
        logged = user.toLowerCase() == "admin" && password.toLowerCase() == "admin"
        updateView()
    }

    private fun validateUsername(user: String): Boolean {
        return !(user.contains(",")
                || user.contains(".")
                || user.contains(";"))
    }

    private fun logout() {
        logged = DateTime.now().secondOfMinute().get() % 2 == 0
        updateView()
    }

    private fun updateView() {
        if (logged) {
            loginConstraintLayout.visibility = View.GONE
            logoutConstraintLayout.visibility = View.VISIBLE
        } else {
            logoutConstraintLayout.visibility = View.GONE
            loginConstraintLayout.visibility = View.VISIBLE
        }
    }
}
