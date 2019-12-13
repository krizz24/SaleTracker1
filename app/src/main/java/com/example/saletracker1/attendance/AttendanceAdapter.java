package com.example.saletracker1.attendance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.saletracker1.R;
import com.example.saletracker1.recyclerview.ProductAdapter;
import com.example.saletracker1.recyclerview.Products;

import java.util.ArrayList;


public class AttendanceAdapter extends ArrayAdapter<Attendance> implements View.OnClickListener {

    private ArrayList<Attendance> attendance;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {

        TextView date;
        TextView fromTime;
        TextView toTime;
    }

    public AttendanceAdapter(ArrayList<Attendance> data, Context context) {
        super(context, R.layout.previous_attendance_row, data);
        this.attendance = data;
        this.mContext=context;

    }
    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Attendance dataModel=(Attendance) object;

        switch (v.getId())
        {
//            case R.id.item_info:
//                Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Attendance attendance = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        AttendanceAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new AttendanceAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.previous_attendance_row, parent, false);

            viewHolder.date = (TextView) convertView.findViewById(R.id.attendance_date);
            viewHolder.fromTime = (TextView) convertView.findViewById(R.id.attendance_from_time);
            viewHolder.toTime = (TextView) convertView.findViewById(R.id.attendance_to_time);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (AttendanceAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.date.setText(attendance.getDate());
        viewHolder.fromTime.setText(attendance.getFromTime());
        viewHolder.toTime.setText(attendance.getToTime());

//        viewHolder.info.setOnClickListener(this);
//        viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }



}
