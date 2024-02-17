package Conditions;
import java.util.Scanner;
/* Create a java function that takes three integer parameters representing the sides of a triangle and prints
whether it's equilateral, isosceles, or scalene.
*/
public class equilateralIsoscelesScalene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st parameters: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd parameters: ");
        int b = sc.nextInt();
        System.out.print("enter 3rd parameters: ");
        int c = sc.nextInt();

        if(a==b && b==c && c==a){
            System.out.print("It's an equilateral triangle.");
        }
        else if(a!=b || b!=c || c!=a){
            if(a==b || b==c || c==a){
                System.out.print("It's an isosceles triangle.");
            }
            else{ // a!=b && b!=c && c!=a
                System.out.print("It is a scalene triangle.");
            }
        }

    }
}

