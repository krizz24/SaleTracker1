package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.saletracker1.employee.Employee;
import com.example.saletracker1.employee.EmployeeAdapter;

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
        employee.add(new Employee( "Anjana", "Kiran",
                "15/02/1980", "Female",
                "Anjana, Pattom, Trivandrum" ,"9874652310",
                "anjana@gmail.com", "1234","2"));
        employee.add(new Employee( "Ajay", "Prasad",
                "02/02/1993", "Male",
                "Ajay,Palarivattom, Ernakulam" ,"9587410362",
                "ajay@gmail.com", "1234","3"));
        employee.add(new Employee( "Kiran", "Prasad",
                "01/06/1986", "Male",
                "House No. 12, Kannur" ,"984670213",
                "kiran@gmail.com", "1234","4"));
        employee.add(new Employee( "Nikhil", "Prasad",
                "01/05/1995", "Male",
                "Nikhilam, Karyavattom, Trivandrum" ,"954130278",
                "nikhil@gmail.com", "1234","5"));


        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","6"));
        employee.add(new Employee( "Anjana", "Kiran",
                "15/02/1980", "Female",
                "Anjana, Pattom, Trivandrum" ,"9874652310",
                "anjana@gmail.com", "1234","7"));
        employee.add(new Employee( "Ajay", "Prasad",
                "02/02/1993", "Male",
                "Ajay,Palarivattom, Ernakulam" ,"9587410362",
                "ajay@gmail.com", "1234","8"));
        employee.add(new Employee( "Kiran", "Prasad",
                "01/06/1986", "Male",
                "House No. 12, Kannur" ,"984670213",
                "kiran@gmail.com", "1234","9"));
        employee.add(new Employee( "Nikhil", "Prasad",
                "01/05/1995", "Male",
                "Nikhilam, Karyavattom, Trivandrum" ,"954130278",
                "nikhil@gmail.com", "1234","10"));



        /*employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","6"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","7"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","8"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","9"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","10"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","11"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","12"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","13"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","14"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","15"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","16"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","17"));
        employee.add(new Employee( "Arya", "Prasad",
                "10/05/1985", "Female",
                "Arya,TC123,Trivandrum" ,"9874652310",
                "arya@gmail.com", "1234","18"));*/

        adapter= new EmployeeAdapter(employee,getApplicationContext());

        listView.setAdapter(adapter);

    }
}
