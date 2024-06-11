import java.util.Scanner;

public class CBSEBoardExamPercentage {
    public static void main (String[] args) {
        System.out.println("CBSE Board Exam Total Percentage Calculator");
        System.out.println("Enter the marks for all the subjects that is displayed one at a time.");
        Scanner sc = new Scanner(System.in);
        System.out.print("English - ");
        float english = sc.nextFloat();
        System.out.print("Hindi - ");
        float hindi = sc.nextFloat();
        System.out.print("Kannada - ");
        float kannada = sc.nextFloat();
        System.out.print("Maths - ");
        float maths = sc.nextFloat();
        System.out.print("SocialScience - ");
        float social = sc.nextFloat();
        System.out.print("Science - ");
        float science = sc.nextFloat();
        float marks = english + hindi + kannada + maths + social + science;
        float percentage = (marks/600) * 100;
        System.out.println("The percentage of CBSE Board Examination is " + percentage);
    }
}
