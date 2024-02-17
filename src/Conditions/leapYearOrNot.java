package Conditions;
import java.util.Scanner;
/* Implement a java function to determine if a given year is a leap year or not. Print "leap Year" if
true,otherwise print "Not a Leap Year".*/
public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year: ");
        int n = sc.nextInt();

        if(n%4==0){
            System.out.print(n+" year is a leap year.");
        }
        else{
            System.out.print(n+" not a leap year.");
        }
    }
}
