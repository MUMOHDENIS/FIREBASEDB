package com.example.midmorningfirebasedatabaseapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtIdNumber: EditText
    lateinit var btnSave :Button
    lateinit var btnview: Button
    lateinit var progressDialog:ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtIdNumber = findViewById(R.id.mEdtidNumber)
        btnSave = findViewById(R.id.mBtnSave)
        btnview = findViewById(R.id.mBtnView)
        progressDialog= ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait....")
        btnSave.setOnClickListener {

        }
        btnview.setOnClickListener {

        }
    }
}