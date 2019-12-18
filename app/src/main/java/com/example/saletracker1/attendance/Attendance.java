package com.example.saletracker1.attendance;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class Attendance {

    private String date;
    private String fromTime;
    private String toTime;


    public Attendance( String date, String fromTime, String toTime){
        this.date=date;
        this.fromTime=fromTime;
        this.toTime=toTime;
    }

    public String getDate() {
        return date;
    }

    public String getFromTime() {
        return fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }
}
