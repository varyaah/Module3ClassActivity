import java.util.Scanner;


public class Percentages {

  public static void computePercent(double value1, double value2) {
    double percent = value1 / value2 * 100;
    System.out.println(value1 + " is " + percent + "% of " + value2);
  }
  
  public static void main(String[] args) {
    double value1;
    double value2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter value 1:");

    value1 =  Double.parseDouble(scanner.nextLine());

    System.out.println("Enter value 2:");

    value2 =  Double.parseDouble(scanner.nextLine());

    computePercent(value1, value2);
    computePercent(value2, value1);

  }
}