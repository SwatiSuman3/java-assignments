package Basic;
import java.util.Scanner;
public class areaOfCircleAndSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle :");
        float r =sc.nextFloat();
        System.out.println("Area of Circle : " +(3.1415 * r * r));
        System.out.print("enter principle amount:");
        float p =sc.nextFloat();
        System.out.print("enter rate of interest:");
        float rate =sc.nextFloat();
        System.out.print("enter time:");
        float t =sc.nextFloat();
        System.out.println("simple interest:" +(p * rate * t));
    }
    
}
