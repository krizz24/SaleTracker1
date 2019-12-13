package com.example.saletracker1.employee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;

import com.example.saletracker1.R;
import com.example.saletracker1.attendance.Attendance;
import com.example.saletracker1.attendance.AttendanceAdapter;

import java.util.ArrayList;

public class EmployeeAdapter extends ArrayAdapter<Employee> implements View.OnClickListener {

    private ArrayList<Employee> employee;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {

        TextView employeeId;
        TextView employeeFirstName;
        TextView employeeLastName;
        TextView employeeDob;
        TextView employeeGender;
        TextView employeePhone;
        TextView employeeEmail;
    }

    public EmployeeAdapter(ArrayList<Employee> data, Context context) {
        super(context, R.layout.employee_row, data);
        this.employee = data;
        this.mContext=context;

    }
    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Employee dataModel=(Employee) object;

    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Employee employee = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        EmployeeAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new EmployeeAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.employee_row, parent, false);

            viewHolder.employeeId = (TextView) convertView.findViewById(R.id.employee_id);
            viewHolder.employeeFirstName = (TextView) convertView.findViewById(R.id.employee_name);
            viewHolder.employeeDob = (TextView) convertView.findViewById(R.id.employee_dob);
            viewHolder.employeeGender = (TextView) convertView.findViewById(R.id.employee_gender);
            viewHolder.employeePhone = (TextView) convertView.findViewById(R.id.employee_phone);
            viewHolder.employeeEmail = (TextView) convertView.findViewById(R.id.employee_email);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (EmployeeAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.employeeId.setText(employee.geteId());
        viewHolder.employeeFirstName.setText(employee.getFirstName());
        viewHolder.employeeDob.setText(employee.getdOB());
        viewHolder.employeeGender.setText(employee.getGender());
        viewHolder.employeePhone.setText(employee.getPhone());
        viewHolder.employeeEmail.setText(employee.getEmail());

//        viewHolder.info.setOnClickListener(this);
//        viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }





}
