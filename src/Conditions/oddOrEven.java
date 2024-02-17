package Conditions;
// write a java function that takes an integer as input and print "even".If the number is even and "odd", if it is odd.
import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.print(n+" is even.");
        }
        else{
            System.out.print(n+" is odd.");
        }
    }
}
