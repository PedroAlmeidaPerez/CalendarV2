package mainApp;


 import main.java.controller.CalendarController;
 import main.java.view.CalendarView;

 import javax.swing.*;
 import java.util.Calendar;
 import java.util.GregorianCalendar;


        /**
  * Created by PedroAlmeida on 04.07.2017.
  */
 public class Main {
     public static void main(String[] args) {
        CalendarView view = new CalendarView();

         view.setSize(800, 600);
         // frame.setLayout(null); //mirar
         view.setLocationRelativeTo(null);
         view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         view.setVisible(true);
        Calendar model = new GregorianCalendar();
        CalendarController controller = new CalendarController(/*model, view*/ );


     }
}
