import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

String fname = "";
String lname = "";
String favoriteAnimal = "";
String favoriteFood = "";
String favoriteSong = "";

System.out.println("What is your first name?");
Scanner obj1=new Scanner (System.in);
fname=obj1.nextLine();

System.out.println("What is your last name?");
Scanner obj2=new Scanner (System.in);
lname=obj2.nextLine();

System.out.println("What is your favorite animal?");
Scanner obj3=new Scanner (System.in);
favoriteAnimal = obj3.nextLine();

System.out.println("What is your favorite food?");
Scanner obj4=new Scanner (System.in);
favoriteFood = obj4.nextLine();

System.out.println("What is your favorite song?");
Scanner obj5=new Scanner (System.in);
favoriteSong = obj5.nextLine();

System.out.println("My name is "+fname+" "+lname+".");
System.out.println("My favorite animal is the "+favoriteAnimal+".");
System.out.println("My favorite food is "+favoriteFood+".");
System.out.println("My favorite song is "+favoriteSong+".");

  }
}
