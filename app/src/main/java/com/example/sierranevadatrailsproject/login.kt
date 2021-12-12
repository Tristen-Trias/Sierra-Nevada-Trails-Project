package com.example.sierranevadatrailsproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.view.*

class login : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        createButtons(view)

        return view
    }

    fun createButtons(view: View) {
        view.fragment_login.log_button.setOnClickListener{

            val username: String = view.username_input.text.toString()
            val password: String = view.password_input.text.toString()

            if (username == "admin" && password == "password") {
                Navigation.findNavController(view).navigate(R.id.loginToTrails)
            } else {
                Toast.makeText(activity, "Invalid username/password.", Toast.LENGTH_SHORT).show()
            }

        }

        view.fragment_login.signup_button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.loginToCreate)
        }
    }

}