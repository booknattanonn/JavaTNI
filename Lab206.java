import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab206 {
    public static void main(String[] args) {
        final int buffet = 299;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");


        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer"));

        double total = buffet * customer + (buffet * customer * 0.07);
        int discount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is " + df.format(total) + "baht." +
                "\nHow much of discount(%) on your coupon"));
        double total_Price = total - (total * discount /100.0);
        int paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + df.format(total_Price) +" baht."
                + "\nEnter the amount the custpmer paid"));
        double change = paid-total_Price;
        JOptionPane.showMessageDialog(null,"Total price is" + df.format(total_Price) + "bath" +
                "\nCustomer paid " + df.format(discount) + "baht" + "\nGet change " + df.format(change) + "baht");





    }
}
