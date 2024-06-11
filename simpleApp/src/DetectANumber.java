import java.util.Scanner;
public class DetectANumber {
    public static void main(String[] args) {
        System.out.println("Let us detect if a given number is int or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        System.out.println(sc.hasNextInt());
    }
}
