package Loops;
import java.util.Scanner;
// WAPto generate and print the first 'n' terms of the fibonaaci series.
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        if(n==1 || n==2){
            System.out.print("1");
        }
        else{
            int a = 1;
            int b = 1;
            for(int i=3;i<=n;i++){
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.print(b);
        }
    }
}
