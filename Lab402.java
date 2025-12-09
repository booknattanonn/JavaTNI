import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String student_id = "";
        do{
            student_id = JOptionPane.showInputDialog(null,"Enter student id: ");
            if (student_id.length() == 10) break;
        }while (true);
        String code = student_id.substring(2,5), major= " ";
        if (code.equals("131")) major = "Information Techology (IT)";
        else if (code.equals("131")) major = "Informat Techology (MT)";
        else if (code.equals("133")) major = "Digital Business Information Tecchology (BI)";
        else if (code.equals("134")) major = "Digital Technology in Mass Comunication (DC)";
        else if (code.equals("134")) major = "Data Science and  Data Analytics (DS)";
        else major = "Cannot found major";
        JOptionPane.showMessageDialog(null,"Student ID: " + student_id + "\nMajor: " + major);

    }
}
