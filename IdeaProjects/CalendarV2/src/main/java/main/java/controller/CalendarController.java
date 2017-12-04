package main.java.controller;

import main.java.view.CalendarView;

import java.util.Calendar;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class CalendarController {

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private Calendar model;
    private CalendarView view;


    public CalendarController(Calendar model, CalendarView view) {
         this.model = model;
         this.view = view;
         generateCalendarConfiguration();
         //setUpViewEvents();
        // this.view.Cabecera(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime());//, calendarConfiguration.getDays());
     }

    private void generateCalendarConfiguration() {
        println (String.valueOf((model.getTime())));
    }

    private String Fecha(){
        return String.valueOf(model.getTime());
    }


}
