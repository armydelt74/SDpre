import java.util.Scanner;

public class Objective3Lab5 {
  public static void main( String[] args ) {
    double num1, num2;

    Scanner input = new Scanner(System.in);

    System.out.print( "Pick a number");
      num1 = input.nextDouble();

    System.out.print( "Pick another number");
      num2 = input.nextDouble();

    double sum;
    sum = num1 + num2;

    System.out.print( "The sum of" + num1 + "+" + num2 + "=" + sum);

      input.close();
  }
}
