import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    StringBuilder fiscalCode = new StringBuilder();

    String fname, sname, gender, year_of_birth;
    int month_of_birth, Date_of_birth;


    System.out.print("First name: ");
    fname = scan.nextLine();


    System.out.print("Surname: ");
    sname = scan.nextLine();


    System.out.print("year of birth: ");
    year_of_birth = scan.next();


    System.out.print("month of birth(in number): ");
    month_of_birth = scan.nextInt();


    System.out.print("date of birth: ");
    Date_of_birth = scan.nextInt();


    System.out.print("Gender (M or F): ");
    gender = scan.next();




    System.out.println();

    fiscalCode.append(name_surname_class.fandsname(sname, false));
    fiscalCode.append(name_surname_class.fandsname(fname, true));
    fiscalCode.append(Dob_class.year(year_of_birth));
    fiscalCode.append(Dob_class.month(month_of_birth));
    fiscalCode.append(Dob_class.day(Date_of_birth, gender));
    fiscalCode.append(CIN.cin(fiscalCode.toString()));

    // Output
    System.out.println("The code generated is: " + fiscalCode.toString());
  }

}
