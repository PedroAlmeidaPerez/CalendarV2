package main.java.view;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarView extends JFrame{
    private String[] nameOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private Fechas fechas;
    public CalendarView(Calendar model) {
        setTitle("Calendar V2");
        setBounds(600, 350, 600, 300);

        Cabecera cabecera = new Cabecera(model);
        add(cabecera, BorderLayout.NORTH);


        fechas = new Fechas();
        fechas.ponerDias(nameOfDays);
        fechas.setLayout(new GridLayout(1,7));
        add(fechas, BorderLayout.CENTER);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}


class Cabecera extends JPanel{

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private Calendar model;
    private String [] dates = {"WEEK", "MONTH"};

    public Cabecera(Calendar model) {
        JTextField fecha = new JTextField(String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime())));
        add(new JButton("<<"));
        add(fecha);
        add(new JButton(">>"));
        add(new JComboBox(dates));

    }
}

class Fechas extends JPanel{


    public Fechas(){


    }
    public void ponerDias (String [] day){

        setLayout(new GridLayout(7, 7));
        for (int j = 0; j < 7; j++) {
            add(new JLabel(day[j], SwingConstants.CENTER));
        }


    }
}