package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectLoginActivity extends AppCompatActivity {

    public static final String TYPE_COMPANY = "company";
    public static final String TYPE_EMPLOYEE = "employee";

    public static final String SELECT_TYPE_KEY = "selectType";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_login);
    }

    public void buttonSelectCompanyClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(SELECT_TYPE_KEY, TYPE_COMPANY);
        startActivity(intent);
    }

    public void buttonSelectEmployeeClick(View view) {

        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(SELECT_TYPE_KEY, TYPE_EMPLOYEE);
        startActivity(intent);

        /*
        TextView textView_login_not_registered= findViewById(R.id.login_not_registered);
        TextView textView_sign_up= findViewById(R.id.login_sign_up);

        textView_login_not_registered.setVisibility(View.VISIBLE);
        textView_sign_up.setVisibility(View.VISIBLE);
        */

    }

}
