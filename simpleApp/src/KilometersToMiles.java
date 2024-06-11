import  java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Kilometer to Mile Conversion' application");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometer - ");
        float km = sc.nextFloat();
        double convert = (km * 0.621371);
        System.out.println(km + " Kilometer is " + convert + " Miles.");
    }
}
