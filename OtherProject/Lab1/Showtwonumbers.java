import javax.swing.JOptionPane;
public class Showtwonumbers {

    public static void main(String[] args){
        String strNum1, strNum2;
        String Notification = "You 've just entered";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "input the first number",JOptionPane.INFORMATION_MESSAGE);
        Notification += strNum1 + " AND ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "input the second number",JOptionPane.INFORMATION_MESSAGE);
        Notification += strNum2;
        JOptionPane.showMessageDialog(null, Notification,"Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);    
        System.exit(0);
    }
}