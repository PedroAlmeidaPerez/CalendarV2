package controller;

import view.CalendarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarController {

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private static int restaMes = -1;
    private static int sumaMes = 1;
    private Calendar calendar;
    private CalendarView view;

    public CalendarController(CalendarView view, Calendar calendar) {
        this.calendar = calendar;
        this.view = view;
        CrearEvento();
        CrearEvento2();
        EventoBoton();
    }

    private void CrearEvento() {
        view.getButtonBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("pulsado");
                calendar.add(Calendar.MONTH,-1);
                String fecha = String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(calendar.getTime()));
                System.out.println("Primera parte fecha resta; " + fecha);
                view.actualizarView(calendar,fecha);
                System.out.println("Segunda parte fecha resta; " + fecha);


            }
        });
    }



    private void CrearEvento2() {
        view.getButtonForwards().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                calendar.add(Calendar.MONTH, 1);
                System.out.println("Instancia: " + Calendar.getInstance());

                String fecha = String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(calendar.getTime()));
                System.out.println("Fecha; " + fecha);
                view.actualizarView(calendar,fecha);
                ////algo falla aqui que se repite dos veces
                //view.actualizarView(model, fecha);

                System.out.println("Sale");

            }
        });
    }

    private void EventoBoton() {
        view.getDiaButton().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("pulsado");
            }
        });
    }
}
