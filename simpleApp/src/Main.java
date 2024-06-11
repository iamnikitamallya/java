//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hey! How you?");

        for(int i=0; i<=5; i++) {
            String num = "i = " + i;
            System.out.println(num);
        }

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;

        System.out.print("Sum of 3 numbers is "+ sum);
    }
}