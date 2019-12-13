package com.example.saletracker1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    LinearLayout signUpView;
    String loginType;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUpView = findViewById(R.id.sign_up_ll);
        loginType = getIntent().getStringExtra(SelectLoginActivity.SELECT_TYPE_KEY);


        if (loginType.equals(SelectLoginActivity.TYPE_EMPLOYEE)) {
            signUpView.setVisibility(View.GONE);
        }
    }

    public void buttonSignInClick(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(SelectLoginActivity.SELECT_TYPE_KEY, loginType);
        startActivity(intent);
    }

    public void processSignUpLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);


    }

}