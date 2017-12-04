package main.java.view;

import javax.swing.*;
import java.awt.*;

public class CalendarView extends JFrame{

    public CalendarView() {
        setTitle("Calendar V2");
        setBounds(600, 350, 600, 300);
        Cabecera cabecera = new Cabecera();
        add(cabecera, BorderLayout.WEST);

    }
}

class Cabecera extends JPanel{


    public Cabecera() {
        add(new JButton("<<"));
        JTextField fecha = new JTextField("TEXTO POR DEFECTO");
        add(fecha);
        add(new JButton(">>"));
    }
}