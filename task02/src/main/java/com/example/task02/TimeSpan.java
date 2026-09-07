package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        int total = hour * 3600 + minute * 60 + second;
        this.hour = total / 3600;
        this.minute = (total % 3600) / 60;
        this.second = total % 60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    void add(TimeSpan time) {
        int total = (this.hour + time.hour) * 3600 + (this.minute + time.minute) * 60 + (this.second + time.second);
        this.hour = total / 3600;
        this.minute = (total % 3600) / 60;
        this.second = total % 60;
    }

    void subtract(TimeSpan time) {
        int total = (this.hour - time.hour) * 3600 + (this.minute - time.minute) * 60 + (this.second - time.second);
        if (total < 0) total = 0;
        this.hour = total / 3600;
        this.minute = (total % 3600) / 60;
        this.second = total % 60;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
