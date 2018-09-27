package com.example.basiclogins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText fieldUsername;
    private EditText fieldPassword;
    private Button buttonLogin;
    private TextView textViewCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        wireWidgets();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void wireWidgets() {
        fieldUsername = findViewById(R.id.editText_login_username);
        fieldPassword = findViewById(R.id.editText_login_password);
        buttonLogin = findViewById(R.id.button_login_login);
        textViewCreateAccount = findViewById(R.id.textView_login_createaccount);
    }
}
