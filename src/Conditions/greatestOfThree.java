package Conditions;
import java.util.Scanner;
// Write a java program to find and print the greatest of three numbers entered by the user.
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("enter 3rd number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print(a+" is greatest.");
        }
        else if(b>a && b>c){
            System.out.print(b+" is greatest.");
        }
        else{ // c>a && c>b
            System.out.print(c+" is greatest.");
        }
    }
}
