import java.util.Calendar;

public class Dob_class {

  public static String year(String year) {

    if (Integer.parseInt(year) < 1900 ||
        Integer.parseInt(year) > Calendar.getInstance().get(Calendar.YEAR)) {
      System.exit(-1);
    }

    return year.substring(2);
  }


  public static String month(int month) {

    if (month < 1 || month > 12) {
      System.exit(-1);
    }

    month -= 1;

    String[] months = {"A", "B", "C", "D", "E", "H", "L", "M", "P", "R", "S", "T"};

    return months[month];
  }


  public static String day(int day, String gender) {

    if (day < 1 || day > 31) {
      System.exit(-1);
    }

    if (!(gender.equals("M") || gender.equals("F"))) {
      System.exit(-1);
    }

    if (gender.equals("F")) {
      day += 40;
    }

    return String.valueOf(day);
  }

}
