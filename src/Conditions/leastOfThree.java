package Conditions;
import java.util.Scanner;
// Develop a java program to find and print the least of 3 numbers using nested if-else statement.
public class leastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("enter 3rd number: ");
        int c = sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println(a+" is smallest.");
            }
            else{    //c < a < b
                System.out.println(c+" is smallest.");
            }
        }
        else{     //b < a
            if(b<c){
                System.out.println(b+" is smallest.");
            }
            else{ // c < b
                System.out.println(c+" is smallest.");
            }
        }
    }
}

