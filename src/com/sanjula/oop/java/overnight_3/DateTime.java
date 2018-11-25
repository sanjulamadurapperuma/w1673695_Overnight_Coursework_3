package com.sanjula.oop.java.overnight_3;

public class DateTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;

    public DateTime(){

    }

    public DateTime(int year, int month, int day, int hour, int minutes) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
    }

    public DateTime(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;
        this.minutes = 0;
    }

    public DateTime(int hour, int minutes) {
        super();
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String toDateString(){
        return day + "/" + month + "/" + year;
    }

    public String toTimeString(){
        return hour + ":" + minutes;
    }

    public String getDate(){
        String formattedDay;
        if (day < 10){
            formattedDay = String.format("%02d", day);
        } else{
            formattedDay = Integer.toString(getDay());
        }

        String formattedMonth;
        if (month < 10) {
            formattedMonth = String.format("%02d", month);
        } else{
            formattedMonth = Integer.toString(getMonth());
        }
        return formattedDay + "/" + formattedMonth + "/" + getYear();
    }



    public DateTime parseDate(String date){
        String[] dateSections = date.split("[-\\.:]");
        int day = Integer.parseInt(dateSections[0]);
        int month = Integer.parseInt(dateSections[1]);
        int year = Integer.parseInt(dateSections[2]);

        return new DateTime(year, month, day);
    }

    public DateTime parseTime(String time){
        String[] timeSections = time.split("[-\\.:]");
        int hour = Integer.parseInt(timeSections[0]);
        int minutes = Integer.parseInt(timeSections[1]);

        return new DateTime(hour, minutes);
    }
}
