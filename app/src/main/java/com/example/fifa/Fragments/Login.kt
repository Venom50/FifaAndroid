package com.example.fifa.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.fifa.MainActivity
import com.example.fifa.Models.User
import com.example.fifa.R
import kotlinx.android.synthetic.main.fragment_login.view.*

class Login : Fragment() {

    lateinit var loginEditText: EditText
    lateinit var passwordEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val act = activity as MainActivity

        act.userArrayList.add(
            User(
                login = "admin",
                password = "admin",
                email = "admin@admin.com"
            )
        )

        view.registerButton.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_login_to_register)
        }

        view.loginButton.setOnClickListener {

            loginEditText = view.loginEditText
            passwordEditText = view.passwordEditText

            if(act.userArrayList.any {
                    it.login == loginEditText.text.toString() && it.password == passwordEditText.text.toString()
                }) {
                Navigation.findNavController(view).navigate(R.id.action_login_to_listOfOptions)
            } else {
                Toast.makeText(this.context, "Wrong login data", Toast.LENGTH_SHORT).show()
            }

        }
        return view
    }
}
