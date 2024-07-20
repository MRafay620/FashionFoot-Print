package com.moeezasapplication.app.appcomponents.googleauth

import android.app.Activity
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException

class GoogleHelper(
    private val activity: ComponentActivity,
    private val onSuccess: (account: GoogleSignInAccount) -> Unit,
    private val onError: (statusCode: Int) -> Unit
) {
    private var mGoogleSignInClient: GoogleSignInClient? = null

    private val startForGoogleResult =
        activity.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Handle Result
                handleResult(result.data)
            }
        }

    init {
        configureGoogleSignIn()
    }

    fun login() {
        val account = GoogleSignIn.getLastSignedInAccount(activity)
        if (account != null) {
            onSuccess(account)
        } else {
            signIn()
        }
    }

    private fun configureGoogleSignIn() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso)
    }

    private fun handleResult(data: Intent?) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        try {
            val account: GoogleSignInAccount? = task.getResult(ApiException::class.java)
            if (account != null) {
                onSuccess(account)
            }
        } catch (e: ApiException) {
            onError(e.statusCode)
        }
    }

    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInClient!!.signInIntent
        startForGoogleResult.launch(signInIntent)
    }
}