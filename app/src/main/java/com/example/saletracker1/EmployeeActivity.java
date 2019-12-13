package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.saletracker1.employee.Employee;
import com.example.saletracker1.employee.EmployeeAdapter;
import com.example.saletracker1.recyclerview.ProductAdapter;
import com.example.saletracker1.recyclerview.Products;

import java.util.ArrayList;

public class EmployeeActivity extends AppCompatActivity {

    ArrayList<Employee> employee;
    ListView listView;
    private static EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);


        listView=(ListView)findViewById(R.id.employee_listview);

        employee = new ArrayList<>();


        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","1"));

        adapter= new EmployeeAdapter(employee,getApplicationContext());

        listView.setAdapter(adapter);

    }
}
