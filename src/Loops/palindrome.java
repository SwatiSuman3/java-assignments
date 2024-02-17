package Loops;
import java.util.Scanner;
// WAP to check if a given string is a palindrome or not using a loop.
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.nextLine();
        int m = s.length();
        int a = 0, b = m-1;
        boolean i = true;

        while(a<=b) {
            if (s.charAt(a) == s.charAt((b))) {
                a++;
                b--;
            } else {  //  s[a] != s[b]
                i = false;
                break;
            }
        }
        if(i==true){
            System.out.println("it is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }
}
