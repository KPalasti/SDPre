import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    int num1=0, num2 =0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

System.out.println("Please enter the first whole number you would like to add.");
Scanner obj1= new Scanner(System.in);
num1=obj1.nextInt();

System.out.println("Please enter the second whole number you would like to add.");
Scanner obj2= new Scanner(System.in);
num2=obj2.nextInt();

System.out.println("Please enter the third whole number you would like to add.");
Scanner obj3= new Scanner(System.in);
num3=obj3.nextInt();

System.out.println("Please enter the first decimal number you would like to add.");
Scanner obj4= new Scanner(System.in);
dub1=obj4.nextDouble();

System.out.println("Please enter the second decimcal number you would like to add.");
Scanner obj5= new Scanner(System.in);
dub2=obj5.nextDouble();

System.out.println("Please enterthe third decimal number you would like to add.");
Scanner obj6 = new Scanner(System.in);
dub3=obj6.nextDouble();

int sum;
sum = num1+num2+num3;

double dubsum;
dubsum = dub1+dub2+dub3;

System.out.println("The sum of "+num1+" "+num2+" "+num3+" = "+sum);
System.out.println("The sum of "+dub1+" "+dub2+" "+dub3+" = "+dubsum);
  }
}
