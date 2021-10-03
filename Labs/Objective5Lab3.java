import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args){

//Does not work for decimal numbers

    int userNum;

    System.out.println("Please enter a number: ");
    Scanner obj1 = new Scanner(System.in);
    userNum = obj1.nextInt();

    if (userNum >= 0) {
      System.out.println("The number is positive");
    }

    else {
      System.out.println("The number is negative");
    }


  }
}
