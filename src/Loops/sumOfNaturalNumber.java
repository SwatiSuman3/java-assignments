package Loops;
import java.util.Scanner;

// write a java program to calculate the sum of natural numbers up to a given positive integer 'n'.
public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n ; i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
