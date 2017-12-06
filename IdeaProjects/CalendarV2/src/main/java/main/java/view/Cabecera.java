package main.java.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Cabecera extends JPanel implements ActionListener {

        public static final String DD_MM_YYYY = "dd/MM/yyyy";
        private Calendar model;
        private String[] dates = {"MONTH", "WEEK"};
        private JButton backButton;
        private JButton forwardsButton;

        public Cabecera(Calendar model) {
            JTextField fecha = new JTextField(String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime())));
            backButton = new JButton("<<");
            add(backButton);

            add(fecha);
            forwardsButton = new JButton(">>");
            add(forwardsButton);

            add(new JComboBox(dates));

        }

    public JButton getBackButton() {
        return backButton;
    }


    public void actionPerformed(ActionEvent e) {

    }
}