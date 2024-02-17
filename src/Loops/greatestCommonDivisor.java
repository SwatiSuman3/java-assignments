package Loops;
// Write a java program to find GCD of two numbers using loop.
import java.util.Scanner;
public class greatestCommonDivisor {
    public static void swap(int x, int y) {
        int temp;
        temp = x;
        y = x;
        x = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();

        if(a>b){
            swap(a,b);
        }
        int rem = b;
        while(rem!=0){
            rem = b%a;
            b = a;
            a = rem;
        }
        System.out.print(b);
    }
}
