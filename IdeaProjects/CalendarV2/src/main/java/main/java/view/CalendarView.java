package main.java.view;


import main.java.controller.CalendarController;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarView extends JFrame {
    private String[] nameOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private FechasView fechasView;
    private Cabecera cabeceraView;
    private Calendar calendar;
    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private Calendar model;
    private String[] dates = {"MONTH", "WEEK"};
    private JButton backWards;
    private JButton fordWards;

    public CalendarView(Calendar model) {
        setTitle("Calendar V2");
        setBounds(600, 350, 600, 300);

        JTextField fecha = new JTextField(String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime())));

        
        add(new Cabecera(model), BorderLayout.NORTH);

        fechasView = new FechasView();
        fechasView.ponerDias(nameOfDays);
        fechasView.setLayout(new GridLayout(7, 7));
        add(fechasView, BorderLayout.CENTER);


        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        CalendarController controller = new CalendarController(model, fechasView, cabeceraView);

    }




}
