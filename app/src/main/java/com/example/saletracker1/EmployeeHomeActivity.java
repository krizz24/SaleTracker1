package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class EmployeeHomeActivity extends AppCompatActivity {

    Button buttonEmployeeAttendance;
    Button buttonCompanyEmployee;
    String loginType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);


        buttonEmployeeAttendance = findViewById(R.id.btn_employee_attendance);
        buttonCompanyEmployee =  findViewById(R.id.btn_company_employee);

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
    public void buttonCompanyProductClick(View view) {
        Intent intent = new Intent(this, ProductManageActivity.class);
        startActivity(intent);
    }

    public void buttonEmployeeAttendanceClick(View view) {
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }

}
