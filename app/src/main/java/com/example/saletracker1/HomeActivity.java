package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button buttonEmployeeAttendance, buttonCompanyProduct;
    Button buttonCompanyEmployee, buttonEmployeeProduct;
    String loginType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        buttonCompanyEmployee =  findViewById(R.id.btn_company_employee);
        buttonCompanyProduct =  findViewById(R.id.btn_company_product);

        buttonEmployeeAttendance = findViewById(R.id.btn_employee_attendance);
        buttonEmployeeProduct =  findViewById(R.id.btn_employee_product);

        loginType = getIntent().getStringExtra(SelectLoginActivity.SELECT_TYPE_KEY);

        if(loginType.equals(SelectLoginActivity.TYPE_EMPLOYEE)){
            buttonCompanyEmployee.setVisibility(View.GONE);
            buttonCompanyProduct.setVisibility(View.GONE);
        }
        else if(loginType.equals(SelectLoginActivity.TYPE_COMPANY)){
            buttonEmployeeAttendance.setVisibility(View.GONE);
            buttonEmployeeProduct.setVisibility(View.GONE);
        }

    }
    public void buttonCompanyProductClick(View view) {
        Intent intent = new Intent(this, ProductManageActivity.class);
        startActivity(intent);
    }

    public void buttonEmployeeAttendanceClick(View view) {
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }
    public void buttonCompanyEmployeeClick(View view) {
        Intent intent = new Intent(this, EmployeeActivity.class);
        startActivity(intent);
    }

}
