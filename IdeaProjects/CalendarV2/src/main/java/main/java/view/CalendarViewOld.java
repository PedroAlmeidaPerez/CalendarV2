package main.java.view;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


public class CalendarViewOld extends JFrame {
    public CalendarViewOld() {
        createView();
    }

    private void cabezera() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("<<"));
        add(new JButton(">>"));
        //add(BorderLayout.NORTH);
    }

    static JFrame frame = new JFrame("Calendar V2");


    public void createView () {

        /*setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("<<"));
        add(new JButton(">>"));
        JPanel headPanel = new JPanel();
        JPanel datePanel = new JPanel();
        JPanel footerPanel = new JPanel();

        headPanel.setBackground(Color.red);
        headPanel.setBounds(0,0,800,200);

        datePanel.setBackground(Color.yellow);
        datePanel.setBounds(0,200,800,400);

        footerPanel.setBackground(Color.blue);
        footerPanel.setBounds(0,600,800,200);

        add(headPanel, BorderLayout.NORTH);
        add(datePanel,BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);

       // frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(datePanel,BorderLayout.CENTER);
        frame.getContentPane().add(headPanel,BorderLayout.NORTH);
        frame.getContentPane().add(footerPanel,BorderLayout.SOUTH);

        /*
        JPanel headPanel = new JPanel();
        headPanel.setBackground(Color.red);
        headPanel.setBounds(0,0,800,200);

        JPanel datePanel = new JPanel();
        datePanel.setBackground(Color.yellow);
        datePanel.setBounds(0,200,800,400);

        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(Color.blue);
        footerPanel.setBounds(0,600,800,200);

        frame.add(headPanel);
        frame.add(datePanel);
        frame.add(footerPanel);
        */

        frame.setSize(800, 600);
       // frame.setLayout(null); //mirar
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    public void Panel2 () {


    }

}
