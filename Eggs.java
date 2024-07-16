import java.util.Scanner;

public class Eggs {
  public static void main(String[] args) {
    double dozenPrice = 3.25;
    double singlePrice = 0.45;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter num eggs");

    String eggs = scanner.nextLine();

    int numDozen = Integer.parseInt(eggs) / 12;
    int numSingle = Integer.parseInt(eggs) % 12;

    double total = numDozen * dozenPrice + numSingle * singlePrice;

    System.out.println("That's " + numDozen + " dozen at $3.25 per dozen and " + numSingle + " loose eggs at 45 cents each for a total of $" + total);
    
  }
}