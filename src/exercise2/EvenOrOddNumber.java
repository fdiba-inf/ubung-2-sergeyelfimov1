package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number = input.nextInt();
    boolean A = number % 2 == 0;
    
    if (A) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }
}