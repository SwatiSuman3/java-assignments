package Loops;
// Write a java program to print a multiplication table for a given number 'n'.
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        for(int i=1; i<=10 ; i++){
                System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
