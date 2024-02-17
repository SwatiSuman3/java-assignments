package Conditions;
import java.util.Scanner;
/* Design a java program that calculates and prints whether a transaction results in a profit, loss, or
break-even based on the cost price and selling price.*/
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();

        if(sp==cp){
            System.out.print("No profit no loss");
        }
        else if(sp>cp){
            System.out.print("Profit is "+sp);
        }
        else{ // cp>sp
            System.out.print("loss is "+cp);
        }
    }
}
