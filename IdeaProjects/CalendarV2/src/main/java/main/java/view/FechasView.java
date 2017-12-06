package main.java.view;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechasView extends JPanel {

        private int m = 0;
        public static final String DD = "dd";
        private int mes;

        //constructor
        public FechasView() {
        }

        //methods
        public void ponerDias(String[] day) {

            Calendar calendar = GregorianCalendar.getInstance();

            String k = new SimpleDateFormat(DD).format(calendar.getTime());
            System.out.println(k);

            for (int j = 0; j < 7; j++) {
                add(new JLabel(day[j], SwingConstants.CENTER));
            }


            mes = calendar.get(Calendar.MONTH);

            calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);

            System.out.println("-----------------------------------------------");
            System.out.println("Esto es una prueba; " + calendar.getTime());

            System.out.println("Estamos en el mes: " + calendar.get(Calendar.MONTH));
            System.out.println("mes de la variable mes: " + mes);

            int primerDiaMes = calendar.get(Calendar.DAY_OF_WEEK) - 1;
            System.out.println("primer dia dle mes; " + primerDiaMes);

            System.out.println("-----------------------------------------------");



            for (int j = 1; j < 2; j++) {
                for (int i = 0; i < 7; i++) {
                    if (i < primerDiaMes - 1) {
                        add(new JButton("falso")).setVisible(false);
                    } else {

                        System.out.println(calendar.getTime());
                        add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime()))));
                        calendar.add(Calendar.DATE, 1);

                    }
                }
            }

            for (int j = 2; j < 7; j++) {
                for (int i = 0; i < 7; i++) {


                    if (calendar.get(Calendar.MONTH) == mes) {
                        add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime()))));
                        System.out.println(calendar.getTime());
                        calendar.add(Calendar.DATE, 1);
                    } else {
                        add(new JButton("falso")).setVisible(false);
                    }


                }
            }


        }
    }