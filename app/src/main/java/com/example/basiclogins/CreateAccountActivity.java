package com.example.basiclogins;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText nameField;
    private EditText usernameField;
    private EditText passwordField;
    private EditText confirmpasswordField;
    private EditText emailField;
    private Button buttonCreateAccount;
    private ConstraintLayout bgelement;

    private String name;
    private String username;
    private String password;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        Intent receivedIntent=getIntent();
        username = receivedIntent.getStringExtra(LoginActivity.EXTRA_USERNAME);
        usernameField.setText(username);

        wireWidgets();
        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameField.getText().toString();
                username = usernameField.getText().toString();
                password = passwordField.getText().toString();
                email = emailField.getText().toString();
                if(password.length()<6 || password.length()>12){
                    bgelement.setBackgroundColor(Color.argb(255,255,0,0));
                    new CountDownTimer(1000,1000){
                        @Override
                        public void onTick(long millisUntilFinished) {

                        }
                        @Override
                        public void onFinish() {
                            bgelement.setBackgroundColor(Color.argb(255,255,255,255));
                        }
                    }.start();
                } else if (password!=confirmpasswordField.getText().toString()){
                    bgelement.setBackgroundColor(Color.argb(255,255,0,0));
                    new CountDownTimer(1000,1000){
                        @Override
                        public void onTick(long millisUntilFinished) {

                        }
                        @Override
                        public void onFinish() {
                            bgelement.setBackgroundColor(Color.argb(255,255,255,255));
                        }
                    }.start();
                } else {

                }
            }
        });
    }

    private void wireWidgets() {
        nameField = findViewById(R.id.editText_createaccount_name);
        usernameField = findViewById(R.id.editText_createaccount_username);
        passwordField = findViewById(R.id.editText_createaccount_password);
        confirmpasswordField = findViewById(R.id.editText_createaccount_confirmpassword);
        emailField = findViewById(R.id.editText_createaccount_email);
        buttonCreateAccount = findViewById(R.id.button_createaccount_create);
        bgelement = findViewById(R.id.createaccountlayout);
    }
}
