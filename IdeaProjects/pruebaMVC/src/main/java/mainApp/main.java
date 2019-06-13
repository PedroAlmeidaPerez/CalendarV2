package mainApp;

import controller.PruebaControl;
import model.CalendarModel;
import view.CalendarView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        Calendar model = new GregorianCalendar();
        CalendarModel calendarModel = new CalendarModel();
        CalendarView view = new CalendarView(calendar, calendarModel.getDdMmYyyy());

        PruebaControl control = new PruebaControl(view, model);

    }
}
