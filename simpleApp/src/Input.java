import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello! Today we will add two numbers and find out their sum.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int a = sc.nextInt();
        System.out.print("Enter second number - ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The summation of both the number is " + sum);
    }
}
