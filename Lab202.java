import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        double num1 = scanner.nextInt();
        System.out.print("Enter number : ");
        double num2 = scanner.nextInt();

        DecimalFormat frm = new DecimalFormat("#");

        System.out.println("Summation :"+frm.format(num1+num2));
        System.out.println("Subtraction :"+frm.format(num1-num2));
        System.out.println("Multiplication :"+frm.format(num1*num2));
        System.out.println("Division :"+(num1/num2));
        System.out.println("Modulus :"+frm.format(num1%num2));



    }
}
