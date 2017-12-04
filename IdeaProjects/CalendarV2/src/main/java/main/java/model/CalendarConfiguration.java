package main.java.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarConfiguration {
    protected Calendar calendar;
    private Calendar c1 = new GregorianCalendar();
    private String dia = Integer.toString(c1.get(Calendar.DATE));
    private String mes = Integer.toString(c1.get(Calendar.MONTH));
    private String ano = Integer.toString(c1.get(Calendar.YEAR));

    public CalendarConfiguration() {
        //Fecha();
    }

}
