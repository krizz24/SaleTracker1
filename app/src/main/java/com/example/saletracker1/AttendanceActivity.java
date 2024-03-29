package com.example.saletracker1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saletracker1.attendance.Constants;
import com.example.saletracker1.attendance.FetchAddressIntentService;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

import com.example.saletracker1.attendance.Attendance;
import com.example.saletracker1.attendance.AttendanceAdapter;



import java.util.ArrayList;

public class AttendanceActivity extends AppCompatActivity {

    ArrayList<Attendance> attendance;
    ListView listView;
    private static AttendanceAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        listView = (ListView) findViewById(R.id.attendance_listview);

        attendance = new ArrayList<>();


        attendance.add(new Attendance("01/11/2019", "9:05am", "6:00pm"));
        attendance.add(new Attendance("04/11/2019", "9:00am", "6:01pm"));
        attendance.add(new Attendance("05/11/2019", "9:01am", "6:10pm"));
        attendance.add(new Attendance("06/11/2019", "9:10am", "6:15pm"));
        attendance.add(new Attendance("07/11/2019", "9:09am", "6:12pm"));
        attendance.add(new Attendance("08/11/2019", "9:11am", "6:18pm"));
        attendance.add(new Attendance("11/11/2019", "9:08am", "6:02pm"));
        attendance.add(new Attendance("12/11/2019", "9:10am", "6:07pm"));
        attendance.add(new Attendance("13/11/2019", "9:05am", "6:05pm"));
        attendance.add(new Attendance("14/11/2019", "9:04am", "6:02pm"));

        adapter = new AttendanceAdapter(attendance, getApplicationContext());
        listView.setAdapter(adapter);

    }

    public void openCheckIn(View view)
    {
        Intent intent = new Intent(this, CameraPreviewActivity.class);
        startActivity(intent);
    }


    public void processCheckInClick(View view) {

//        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
//        startActivity(intent);


        LocationManager locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);

        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                Log.d("Location", "onLocationChanged: "+location.toString());
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
                Log.d("Location", "onStatusChanged: ");
            }

            @Override
            public void onProviderEnabled(String provider) {
                Log.d("Location", "onProviderEnabled: ");
            }

            @Override
            public void onProviderDisabled(String provider) {
                Log.d("Location", "onProviderDisabled: ");
            }
        };

        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions

            Toast.makeText(this, "Please give location permissions", Toast.LENGTH_SHORT).show();
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }

}
