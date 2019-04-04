package com.protoyanto.manaratian_studentjournal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private TextView logInRegister;
    private EditText edtemailAddress;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtemailAddress = findViewById(R.id.edtEmailAddressLog);
        edtPassword = findViewById(R.id.edtPasswordLog);
        //firebaseAuth = FirebaseAuth.getInstance();

    }

    public void loginRegister(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        logInRegister = findViewById(R.id.login_Register);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Please LogIn First",
                Toast.LENGTH_SHORT)
                .show();
    }

    public void onClickRegister(View view) {

        /*final ProgressDialog progressDialog = ProgressDialog.show(SignUpActivity.this, "Please wait...", "Processing...", true);
        (firebaseAuth.createUserWithEmailAndPassword(edtemailAddress.getText().toString(), edtPassword.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if (task.isSuccessful()) {
                    Toast.makeText(SignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    intent.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                    startActivity(intent);
                }

                else {
                    Log.e("ERROR", task.getException().getMessage());
                    Toast.makeText(SignUpActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });*/




        Intent intent = new Intent(this, MainActivity.class);
        logInRegister = findViewById(R.id.login_Register);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Please LogIn First",
                Toast.LENGTH_SHORT)
                .show();
    }

    }
