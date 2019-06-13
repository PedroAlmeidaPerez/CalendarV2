package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarModel {

    private String [] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", };
    public static final String DD_MM_YYYY = "dd/MM/yyyy";

    private Calendar calendar = new GregorianCalendar();


    public CalendarModel() {
    }

    public CalendarModel(String[] daysOfWeek, Calendar calendar) {
        this.daysOfWeek = daysOfWeek;
        this.calendar = calendar;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendarInstance() {
        return GregorianCalendar.getInstance();
    }

    public String getDdMmYyyy(){
        GregorianCalendar.getInstance();
        //return calendar.getTime();
        return String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(calendar.getTime()));

    }
}
