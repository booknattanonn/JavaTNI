import java.util.Scanner;

public class CakeOrder extends Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //NO1

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake:");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.println("How many pounds : ");
        double pound = scanner.nextDouble();

        //No2

        Birthdaycake order1 = new Birthdaycake(message, pound, flavor, 350);

        //No3
        System.out.println(order1);

        //no4
        System.out.println("Cup cake's Details:");
        System.out.print("Enter a flavor:");
        String cup_flavor = scanner.next();
        System.out.print("How many pieces : ");
        int piece = scanner.nextInt();

        //No 5
        CupCake order2 = new CupCake(piece, cup_flavor,65);
//No6
        System.out.println(order2);

        //Cheese Pie
        System.out.println("Cheesepie's Detalils:");
        System.out.print("Enter a message on Cheesepie:");
        String cheese_flavor = scanner.next();
        System.out.print("Enter a pices : ");
        Cheesepie order3 = new Cheesepie(piece,flavor,60);
        System.out.print(order3);


        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));




    }
}
