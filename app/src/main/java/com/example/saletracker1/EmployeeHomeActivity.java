package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class EmployeeHomeActivity extends AppCompatActivity {

    Button buttonAttendance;
    Button buttonEmployee;
    String loginType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);


        buttonAttendance = findViewById(R.id.btn_attendance);
        buttonEmployee =  findViewById(R.id.btn_employee);

        loginType = getIntent().getStringExtra(SelectLoginActivity.SELECT_TYPE_KEY);

/*
        if(loginType.equals(SelectLoginActivity.TYPE_EMPLOYEE)){
            buttonEmployee.setVisibility(View.GONE);
        }
        else
        if(loginType.equals(SelectLoginActivity.TYPE_COMPANY)){
            buttonAttendance.setVisibility(View.GONE);
        }
*/
    }
}
