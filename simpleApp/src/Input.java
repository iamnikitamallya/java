import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello! Let's learn how to add two numbers in Java");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int a = sc.nextInt();
        System.out.print("Enter the second number - ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of both the number is " + sum);
    }
}
