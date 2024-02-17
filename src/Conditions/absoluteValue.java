package Conditions;
/* Create a java method to find and print the absolute value of an integer without using the built-in
 Math.abs()function.*/
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.print("The absolute value is "+n);
        }
        else{  // n<0
            System.out.print("The absolute value is "+(-n));
        }
    }
}
