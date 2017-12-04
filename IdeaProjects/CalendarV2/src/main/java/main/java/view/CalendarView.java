package main.java.view;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarView extends JFrame{

    public CalendarView(Calendar model) {
        setTitle("Calendar V2");
        setBounds(600, 350, 600, 300);
        Cabecera cabecera = new Cabecera(model);
        add(cabecera, BorderLayout.WEST);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}


class Cabecera extends JPanel{

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    private Calendar model;

    public Cabecera(Calendar model) {
        JTextField fecha = new JTextField(String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime())));
        add(new JButton("<<"));
        add(fecha);
        add(new JButton(">>"));
    }
}