package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarView {


    private JButton buttonBack;
    private JButton buttonForwards;

    private JButton diaButton;

    private JPanel panelCabecera;

    private JPanel panelFechas;
    private JTextField fecha;

    private JComboBox comboDates;
    private JLabel dayLabel;

    private String[] dates = {"MONTH", "WEEK"};

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    public static final String DD = "dd";
    private String[] nameOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
///////////////////////////////////
    public void setFechaTextField(String fechaTextField) {
        this.fechaTextField = fechaTextField;

    }

    public String getFecha() {
        return fechaTextField;
    }
    //////////////////////////////////////

    private String fechaTextField;
    ////secundary
    private int mes;
    public CalendarView(Calendar calendar, String fechaTextField) {
        this.fechaTextField =fechaTextField;
       // cabeceraView(fechaTextField);
        //fechasView(calendar);
        construirView(calendar);

    }


    public void cabeceraView(String fechaTextField) {

        panelCabecera = new JPanel();

        buttonBack = new JButton("<<");
        fecha = new JTextField(fechaTextField);

        buttonForwards = new JButton(">>");
        comboDates = new JComboBox(dates);

        panelCabecera.setLayout(new FlowLayout());
        panelCabecera.add(buttonBack);
        panelCabecera.add(fecha);
        panelCabecera.add(buttonForwards);
        panelCabecera.add(comboDates);
    }

    public void fechasView(Calendar calendar){
        panelFechas = new JPanel();
        panelFechas.setLayout(new GridLayout(7,7));
        //ponerDias(nameOfDays, calendar);
        ponerDiasSegunda(nameOfDays, calendar);

    }

    private static JFrame frame = new JFrame();

    /*public void construirView(){
        //JFrame frame = new JFrame();
        frame.setTitle("Calendar V2");
        frame.setLayout(new BorderLayout());

        //agregamos los paneles al frame principal
        frame.add(panelCabecera, BorderLayout.NORTH);
        frame.add(panelFechas, BorderLayout.CENTER);

        //Configuramos el frame
        frame.pack();

        estructuraFrame();
    }*/

    public void construirView(Calendar calendar) {

        cabeceraView(fechaTextField);
        fechasView(calendar);
        //JFrame frame = new JFrame();
        frame.setTitle("Calendar V2");
        frame.setLayout(new BorderLayout());

        //agregamos los paneles al frame principal
        frame.add(panelCabecera, BorderLayout.NORTH);
        frame.add(panelFechas, BorderLayout.CENTER);

        //Configuramos el frame
        frame.pack();

        estructuraFrame();

    }

    public void actualizarView(Calendar calendar, String fecha){

        cabeceraView(fecha);
        fechasView(calendar);
        frame.add(panelCabecera, BorderLayout.NORTH);
        frame.add(panelFechas, BorderLayout.CENTER);
        estructuraFrame();
        //frame.repaint();
    }

    public void estructuraFrame(){

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }



    public void ponerDias(String[] day, Calendar calendar) {

        //Calendar calendar = GregorianCalendar.getInstance();

        //Paso a String el dia actual
        String k = new SimpleDateFormat(DD).format(calendar.getTime());
        System.out.println(k);

        //Aqui muestro el array de LUN, MAR, MIER, JUE, VIER, SAB, DOM
        for (int j = 0; j < 7; j++) {
            dayLabel = new JLabel(day[j], SwingConstants.CENTER);
            panelFechas.add(dayLabel);
        }


        mes = calendar.get(Calendar.MONTH);

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);

        System.out.println("-----------------------------------------------");
       /* System.out.println("Esto es una prueba; " + calendar.getTime());

        System.out.println("Estamos en el mes: " + calendar.get(Calendar.MONTH));
        System.out.println("mes de la variable mes: " + mes);
*/
        int primerDiaMes = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("primer dia dle mes; " + primerDiaMes);

        System.out.println("-----------------------------------------------");


        //Muestro las primeras fechas de la primera semana
        for (int j = 1; j < 2; j++) {
            for (int i = 0; i < 7; i++) {
                if (i < primerDiaMes - 1) {
                    diaButton = new JButton("falso");
                    panelFechas.add(diaButton).setVisible(false);
                } else {

                   // System.out.println(calendar.getTime());
                    diaButton = new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    panelFechas.add(diaButton);
                    calendar.add(Calendar.DATE, 1);

                }
            }
        }

        //pinto el resto de las fechas del mes
        for (int j = 2; j < 7; j++) {
            for (int i = 0; i < 7; i++) {


                if (calendar.get(Calendar.MONTH) == mes) {
                    diaButton = new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    panelFechas.add(diaButton);
                    //System.out.println(calendar.getTime());
                    calendar.add(Calendar.DATE, 1);
                } else {
                    diaButton = new JButton("falso");
                    panelFechas.add(diaButton).setVisible(false);
                }


            }
        }


    }

    public void ponerDiasSegunda(String[] day, Calendar calendar) {

        //Aqui muestro el array de LUN, MAR, MIER, JUE, VIER, SAB, DOM
        for (int j = 0; j < 7; j++) {
            dayLabel = new JLabel(day[j], SwingConstants.CENTER);
            panelFechas.add(dayLabel);
        }

        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);
        int ano = calendar.get(Calendar.YEAR);
        int primerDiaDelMes = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("Estamos en el mes: " + mes + " del ano " + ano + " el dia de este mes comienza el " + primerDiaDelMes);
        //Calendar.getInstance();
        //System.out.println("Primer dia del mes; " + calendar.getFirstDayOfWeek());

        switch (primerDiaDelMes){
            case 1: primerDiaDelMes = 2;
                    break;
            case 2: primerDiaDelMes = 3;
                break;
            case 3: primerDiaDelMes = 4;
                break;
            case 4: primerDiaDelMes = 5;
                break;
            case 5: primerDiaDelMes = 6;
                break;
            case 6: primerDiaDelMes = 0;
                break;
            case 7: primerDiaDelMes = 1;
                break;
        }
        calendar.set(ano, mes, 1);

        //Calendar.getInstance();
        //Muestro las primeras fechas de la primera semana
       for (int j = 1; j < 2; j++) {
           for (int i = 0; i < 7; i++) { //i<42
                if (i < primerDiaDelMes) {
                    System.out.println("Parte no visible " + String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    diaButton = new JButton("falso");
                    panelFechas.add(diaButton).setVisible(false);
                    //calendar.add(Calendar.DATE, 1);
                } else {

                    // System.out.println(calendar.getTime());
                    diaButton = new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    panelFechas.add(diaButton);
                    String prueba = (String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(calendar.getTime())));
                    diaButton.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            System.out.println("pulsado " + prueba);
                        }
                    });
                    System.out.println("Boton del dia " + diaButton);
                    calendar.add(Calendar.DATE, 1);

                }
            }

        }



        //pinto el resto de las fechas del mes
        for (int j = 2; j < 7; j++) {
            for (int i = 0; i < 7; i++) {


                if (calendar.get(Calendar.MONTH) == mes) {
                    diaButton = new JButton(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    System.out.println(String.valueOf(new SimpleDateFormat(DD).format(calendar.getTime())));
                    panelFechas.add(diaButton);
                    //System.out.println(calendar.getTime());
                    String prueba = (String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(calendar.getTime())));
                    diaButton.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            System.out.println("pulsado " + prueba);
                        }
                    });
                    calendar.add(Calendar.DATE, 1);
                } else {
                    diaButton = new JButton("falso");
                    panelFechas.add(diaButton).setVisible(false);
                }


            }
        }

        calendar.set(ano, mes, dia);



    }

    public JButton getButtonBack() {
        return buttonBack;
    }

    public JButton getButtonForwards() {
        return buttonForwards;
    }

    public JButton getDiaButton() {
        return diaButton;
    }




}
