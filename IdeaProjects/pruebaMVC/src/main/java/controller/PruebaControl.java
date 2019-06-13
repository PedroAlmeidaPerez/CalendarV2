package controller;

import model.CalendarModel;
import view.CalendarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PruebaControl {

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private static int restaMes = -1;
    private static int sumaMes = 1;
    private Calendar model;
    private CalendarView view;

    public PruebaControl(CalendarView view, Calendar model) {
        this.model = model;
        this.view = view;
        CrearEvento();
        CrearEvento2();
    }

    private void CrearEvento() {
        view.getButtonBack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("pulsado");
               // CalendarModel calendarModel = new CalendarModel();
                //System.out.println(calendarModel.getCalendar().getTime());

                //Calendar calendar = Calendar.getInstance();
                //model.getInstance();


                model.add(Calendar.MONTH,-1);
                model.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
                String fecha = String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime()));

                view.actualizarView(model, fecha);


                System.out.println("fecha resta; " + fecha);
               // view.actualizarView(model, fecha);

            }
        });
    }



    private void CrearEvento2() {
        view.getButtonForwards().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                model.add(Calendar.MONTH, 1);
                System.out.println("Instancia: " + Calendar.getInstance());

                String fecha = String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime()));
                System.out.println("Fecha; " + fecha);
                ////algo falla aqui que se repite dos veces
                //view.actualizarView(model, fecha);

                System.out.println("Sale");

            }
        });
    }
}
