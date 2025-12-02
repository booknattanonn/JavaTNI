import javax.swing.*;
import java.text.DecimalFormat;

public class LAB307 {
    public static void main(String[] args) {
        int price = 0,total = 0;
        DecimalFormat frm = new DecimalFormat("###.0");

        do {
            price = Integer.parseInt(JOptionPane.showInputDialog(null,"Input price[Press 0 to stop] " ));

            if (price < 0) {
                price = Integer.parseInt(JOptionPane.showInputDialog(null,"invalaid price\nInput price[Press 0 to stop] " ));
            }
            total += price;

        }while (price != 0  );
        JOptionPane.showMessageDialog(null,"Total price is " + frm.format(total) + " bath ");

    }
}
