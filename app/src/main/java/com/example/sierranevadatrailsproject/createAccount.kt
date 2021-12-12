package com.example.sierranevadatrailsproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_create_account.view.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class createAccount : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create_account, container, false)

        createButtons(view)

        return view
    }

    private fun createButtons(view: View) {
        view.fragment_create_account.toLoginButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.createAccountToLogin)
        }

        view.fragment_create_account.toTrailsButton.setOnClickListener{
            if (checkInputs(view))
                Navigation.findNavController(view).navigate(R.id.createAccountToTrails)
            else
                Toast.makeText(activity, "One or more boxes are empty", Toast.LENGTH_SHORT).show()

        }
    }

    private fun checkInputs(view: View): Boolean {

        val username: String = view.user_create.text.toString()
        val password: String = view.pass_create.text.toString()
        val fullname: String = view.fullname_create.text.toString()

        return !(username == "" || password == "" || fullname == "")
    }

}