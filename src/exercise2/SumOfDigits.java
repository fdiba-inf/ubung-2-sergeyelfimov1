package exercise2;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int digit1 = number % 10;
      number = number / 10;
      int digit2 = number % 10;
      number = number / 10;
      int digit3 = number % 10;
      number = number / 10;
     int Sum = digit1 + digit2 + digit3;
    System.out.println("Sum of digits: " + Sum);
    }
    }