package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText nameField;
    private EditText usernameField;
    private EditText passwordField;
    private EditText confirmpasswordField;
    private EditText emailField;
    private Button buttonCreateAccount;

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
    }

    private void wireWidgets() {
        nameField = findViewById(R.id.editText_createaccount_name);
        usernameField = findViewById(R.id.editText_createaccount_username);
        passwordField = findViewById(R.id.editText_createaccount_password);
        confirmpasswordField = findViewById(R.id.editText_createaccount_confirmpassword);
        emailField = findViewById(R.id.editText_createaccount_email);
        buttonCreateAccount = findViewById(R.id.button_createaccount_create);
    }
}
