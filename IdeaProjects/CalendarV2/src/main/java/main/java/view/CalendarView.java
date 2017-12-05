package main.java.view;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarView extends JFrame{
    private String[] nameOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private Fechas fechas;
    public CalendarView(Calendar model) {
        setTitle("Calendar V2");
        setBounds(600, 350, 600, 300);

        Cabecera cabecera = new Cabecera(model);
        add(cabecera, BorderLayout.NORTH);


        Calendar calendar = Calendar.getInstance();
        fechas = new Fechas();
        fechas.ponerDias(nameOfDays, calendar);
        fechas.setLayout(new GridLayout(7,7));
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
    private String [] dates = {"MONTH", "WEEK"};

    public Cabecera(Calendar model) {
        JTextField fecha = new JTextField(String.valueOf(new SimpleDateFormat(DD_MM_YYYY).format(model.getTime())));
        add(new JButton("<<"));
        add(fecha);
        add(new JButton(">>"));
        add(new JComboBox(dates));

    }
}

class Fechas extends JPanel {

    private Calendar model;
    private int m = 0;
    ArrayList<String> mesCalendario = new ArrayList<String>();


    public static final String DD = "dd";
    //esto va en el boton
    //add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(hoy.getTime()))));

    //constructor
    public Fechas() {
    }

    //methods
    public void ponerDias(String[] day, Calendar model) {

        //Calendar hoy = Calendar.getInstance();
        Calendar hoy = GregorianCalendar.getInstance();

        String k = new SimpleDateFormat(DD).format(hoy.getTime());
        System.out.println(k);

        for (int j = 0; j < 7; j++) {
            add(new JLabel(day[j], SwingConstants.CENTER));
        }

       // int ultimoDiaMes = model.getActualMaximum(Calendar.DAY_OF_MONTH);
        //int primerDiaMes = model.getActualMinimum(Calendar.DAY_OF_MONTH);
        int mes = model.get(Calendar.MONTH);

        hoy.set(hoy.get(Calendar.YEAR), hoy.get(Calendar.MONTH),1);
        //hoy.add(Calendar.MONTH,-10);

        System.out.println("-----------------------------------------------");
        System.out.println("Esto es una prueba; " + hoy.getTime());

        System.out.println("Estamos en el mes: " + hoy.get(Calendar.MONTH));
        System.out.println("mes de la variable mes: " + mes);

        int primerDiaMes = hoy.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("primer dia dle mes; " + primerDiaMes);

        System.out.println("-----------------------------------------------");




        //add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(hoy.getTime()))));
        for (int j = 1; j<2; j++){
            for (int i=0 ; i<7 ; i++){
                if(i<primerDiaMes-1){
                    //System.out.println(hoy.getTime());
                    add(new JButton("falso")).setVisible(false);
                }else{

                    System.out.println(hoy.getTime());
                    add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(hoy.getTime()))));
                    hoy.add(Calendar.DATE, 1);

                }
            }
        }

        for (int j=2; j<7 ; j++){
            for (int i=0 ; i<7 ; i++){



                if(hoy.get(Calendar.MONTH) == mes){
                    add(new JButton(String.valueOf(new SimpleDateFormat(DD).format(hoy.getTime()))));
                    System.out.println(hoy.getTime());
                    hoy.add(Calendar.DATE, 1);
                }else{
                    add(new JButton("falso")).setVisible(false);
                }


            }
        }



    }
}
