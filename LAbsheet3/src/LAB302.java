import javax.swing.*;
import java.util.Scanner;
public class LAB302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = JOptionPane.showInputDialog(null,"Enter your neme ");

        int heigth = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your heigth" ));

        int gender = JOptionPane.showConfirmDialog(null,"Are you biological is Male? "
                ,"gender", JOptionPane.YES_NO_OPTION );

        if (gender == 0){
            JOptionPane.showMessageDialog(null,"Hello MR " + name + "\n If your heigth " + heigth +
                    "\n your weigth must be " + (heigth - 100)+"kg.");
        } else {
            gender =  JOptionPane.showConfirmDialog(null,"Are you biological is Female? "
                    ,"gender", JOptionPane.YES_NO_OPTION );
            if (gender == 0)
            {
                JOptionPane.showMessageDialog(null,"Hello MR " + name + "\n If your heigth " + heigth +
                        "\n your weigth must be " + (heigth - 110)+"kg.");
            } else {
                JOptionPane.showMessageDialog(null,"You can use BMI to measure weigth and higth" );
            }

        }

    }
}


