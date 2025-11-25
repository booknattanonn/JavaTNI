import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.print("Enter product id :");
        String id = scanner.nextLine();

        System.out.print("Enter product name :");
        String name = scanner.nextLine();

        System.out.print("Enter product item :");
        double item = scanner.nextDouble();

        System.out.print("Enter price per piece :");
        double price_per_piece = scanner.nextDouble();
        System.out.println("-------------------------------------------");

        System.out.println("Product name: " + name + "(" +  id + ")");
        System.out.println("Product item: " + item + "(" + price_per_piece + "batn/piece"+")");

        System.out.println("Total price: " + frm.format(item * price_per_piece )+"bath");




    }
}
