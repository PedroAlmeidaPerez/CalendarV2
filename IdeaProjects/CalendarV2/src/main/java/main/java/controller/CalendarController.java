package main.java.controller;

import main.java.view.Cabecera;
import main.java.view.FechasView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalendarController {

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private Calendar model;
    private Cabecera cabeceraView;
    private int forwards;
    private int backwards;
    private JButton selectedButton;


    public CalendarController(Calendar model, FechasView fechasViewView, Cabecera cabeceraView) {
         this.model = model;
         this.cabeceraView = cabeceraView;
         //this.fechas = fechas;
         //generateCalendarConfiguration();
         setUpViewEvents();
        // this.view.Cabecera(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime());//, calendarConfiguration.getDays());
     }

    public CalendarController(Calendar model, /*FechasView fechasViewView,*/ Cabecera cabeceraView) {
        this.model = model;
        this.cabeceraView = cabeceraView;
        //this.fechas = fechas;
        //generateCalendarConfiguration();
        setUpViewEvents();
        // this.view.Cabecera(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime());//, calendarConfiguration.getDays());
    }

    public void setUpViewEvents() {
       addListenerToMoveButtons(cabeceraView.getBackButton(), -1);

    }

    private void addListenerToMoveButtons(JButton backButton, int i) {
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pulsado();
            }
        });

    }

    private void pulsado() {
        System.out.println("para atras");
    }


    private void prueba() {
        System.out.println();

    }


    /*public void addListenerToMoveButtons(JButton view, int forwards, int backwards){


    }*/


    private void generateCalendarConfiguration() {
        System.out.println(String.valueOf((model.getTime())));
    }

    private String Fecha(){
        return String.valueOf(model.getTime());
    }


}
