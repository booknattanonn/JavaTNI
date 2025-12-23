import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = random_aray();
        System.out.print("Enter your guess (0-20) : ");
        int guess_number = scanner.nextInt();
        int count = count_element(number, guess_number);
        if (count > 0) {
            System.out.println("\nCongratulation!! " + guess_number + " is an element is the array!!");
            if (count > 1) System.out.println("Fantasic!! It also appears more than onec!!");
        }
        else {
            System.out.println("\nSorry, try again next time...");
            display_array(number);
        }
    }
    static int[] random_aray() {
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i<number.length-1; i++){
            number[i] = random.nextInt(20);
        }
        return number;
    }
    static void display_array(int[] number){
        System.out.print("Here are the element in the array");
    }
    static int count_element(int[] number, int element) {
        System.out.println("Here are the elements in the array ");
        int count = 0;
        for (int i = 0; i <= number.length-1; i++ ) {
            if (number[i] == element) count++;
        }

    }
}
