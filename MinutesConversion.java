import java.util.Scanner;


public class MinutesConversion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of minutes:");

    int numMinutes =  Integer.parseInt(scanner.nextLine());

    double numHours = numMinutes / 60;
    double numDays = numHours / 24;
    System.out.println(numMinutes + " minutes equals " + numHours + " hours and equals " + numDays + " days.");

  }
}