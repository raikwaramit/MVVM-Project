package com.example.mvvmproject.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders.*
import com.example.mvvmproject.R
import com.example.mvvmproject.databinding.ActivityLoginBinding
import com.example.mvvmproject.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewmodel = of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewmodel
        viewmodel.authListener = this
    }

    override fun onStarted() {
        toast("Login started")
    }

    override fun onSuccess() {
        toast("Login successful")
    }

    override fun onFailure(failureMessage: String) {
        toast(failureMessage)
    }
}