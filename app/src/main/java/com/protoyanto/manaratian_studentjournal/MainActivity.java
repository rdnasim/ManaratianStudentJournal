package com.protoyanto.manaratian_studentjournal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button logIn;
    private Button signUp;


    private EditText edtEmailAddressLog;
    private EditText edtPasswordLog;

    //private FirebaseAuth firebaseAuth;

    LinearLayout linearLayout1, linearLayout2, linearLayout3;


    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            linearLayout1.setVisibility(View.VISIBLE);
            linearLayout2.setVisibility(View.VISIBLE);
            linearLayout3.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmailAddressLog = findViewById(R.id.edtEmailAddressLog);
        edtPasswordLog = findViewById(R.id.edtPasswordLog);

        //firebaseAuth = FirebaseAuth.getInstance();


        linearLayout1 = findViewById(R.id.linear1);
        linearLayout2 = findViewById(R.id.linear2);
        linearLayout3 = findViewById(R.id.linear3);

        handler.postDelayed(runnable, 2000);

    }

    public void onClickLogIn(View view) {


        /*final ProgressDialog progressDialog = ProgressDialog.show(MainActivity.this, "Please wait...", "Processing...", true);
        (firebaseAuth.signInWithEmailAndPassword(edtEmailAddressLog.getText().toString(), edtPasswordLog.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainMenuActivity.class);
                    intent.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                    startActivity(intent);
                }

                else {
                    Log.e("ERROR", task.getException().getMessage());
                    Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });*/

        Intent intent = new Intent(this, HomeActivity.class);
        logIn = findViewById(R.id.logIn);
        startActivity(intent);

    }

    public void onClickSignUp(View view) {


        Intent intent = new Intent(this, SignUpActivity.class);
        signUp = findViewById(R.id.sign_up_Btn);
        startActivity(intent);
    }
}
