package kata.kyu_7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ExtendedWeekends {

  public static String[] solve(int a, int b) {

    Calendar calendar = Calendar.getInstance();

    String firstMonth = null;
    String lustMonth = "";
    int count = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
    SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM", Locale.ENGLISH);
    for (int i = a; i <= b; i++) {
      for (int j = 0; j < 12; j++) {
        calendar.set(i, j, 1);
        int max_date = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (dateFormat.format(calendar.getTime()).equals("Friday")) {
          int fridaysCount = 0;
          int saturdaysCount = 0;
          int sundaysCount = 0;
          for (int k = 1; k <= max_date; k++) {
            calendar.set(i, j, k);

            if (dateFormat.format(calendar.getTime()).equals("Friday")) {
              fridaysCount++;
            }
            if (dateFormat.format(calendar.getTime()).equals("Saturday")) {
              saturdaysCount++;
            }
            if (dateFormat.format(calendar.getTime()).equals("Sunday")) {
              sundaysCount++;
            }
          }

          if (fridaysCount + saturdaysCount + sundaysCount == 15) {
            if (firstMonth == null) {
              firstMonth = dateFormat1.format(calendar.getTime()).toUpperCase();
            }
            lustMonth = dateFormat1.format(calendar.getTime()).toUpperCase();
            count++;
          }
        }
      }
    }

    return new String[]{firstMonth, lustMonth, Integer.toString(count)};
  }

}
