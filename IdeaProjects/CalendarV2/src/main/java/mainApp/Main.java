package mainApp;


import main.java.controller.CalendarController;
import main.java.view.Cabecera;
import main.java.view.CalendarView;

import java.util.Calendar;
import java.util.GregorianCalendar;


        /**
  * Created by PedroAlmeida on 04.07.2017.
  */
 public class Main {
     public static void main(String[] args) {

         Calendar model = new GregorianCalendar();
         CalendarView view = new CalendarView(model);
         Cabecera cabeceraView = new Cabecera(model);
         CalendarController controller = new CalendarController(model, cabeceraView);

     }
}
