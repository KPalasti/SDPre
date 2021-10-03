import java.util.Scanner;

public class Objective5Lab4{
  public static void main (String[] args){

    int userNum;

    System.out.println("Please enter a number: ");
    Scanner obj1 = new Scanner (System.in);
    userNum = obj1.nextInt();

    if (userNum % 2 ==0){
      System.out.println("The number is even.");
    }

    else {
      System.out.println("The number is odd");
    }

  }
}
