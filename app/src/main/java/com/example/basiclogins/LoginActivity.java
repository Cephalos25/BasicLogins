package com.example.basiclogins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public static final String EXTRA_USERNAME = "d1n7e8/G";
    static final int USERNAME_REQUESTCODE = 12847;

    private EditText fieldUsername;
    private EditText fieldPassword;
    private Button buttonLogin;
    private TextView textViewCreateAccount;

    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        wireWidgets();
        textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempusername = fieldUsername.getText().toString();
                Intent createAccountIntent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                createAccountIntent.putExtra(EXTRA_USERNAME, tempusername);
                startActivityForResult(createAccountIntent, USERNAME_REQUESTCODE);
            }
        });
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
