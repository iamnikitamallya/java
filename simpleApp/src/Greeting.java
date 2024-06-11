import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String userFirstName = sc.next();
        System.out.println("Hello! " + userFirstName + ", Good Morning!");
    }
}
