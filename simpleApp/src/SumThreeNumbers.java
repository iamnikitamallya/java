import java.util.Scanner;

public class SumThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Let us add 3 numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        float a = sc.nextFloat();
        System.out.print("Enter second number - ");
        float b = sc.nextFloat();
        System.out.print("Enter third number - ");
        float c = sc.nextFloat();
        float sum = a + b + c;
        System.out.println("The sum of all three number is " + sum);
    }
}
