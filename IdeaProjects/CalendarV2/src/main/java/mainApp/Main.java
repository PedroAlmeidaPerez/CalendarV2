package mainApp;


import controller.CalendarController;
import model.CalendarModel;
import view.CalendarView;

import java.util.Calendar;
import java.util.GregorianCalendar;

        /**
  * Created by PedroAlmeida on 04.07.2017.
  */
 public class Main {
     public static void main(String[] args) {

         Calendar calendar = new GregorianCalendar();

         Calendar model = new GregorianCalendar();
         CalendarModel calendarModel = new CalendarModel();
         CalendarView view = new CalendarView(calendar, calendarModel.getDdMmYyyy());

         CalendarController control = new CalendarController(view, model);

     }
}
