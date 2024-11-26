import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Nhap so thu nhat: ");
        String strNum1 = scanner.nextLine();
        System.out.println("Nhap so thu hai: ");
        String strNum2 = scanner.nextLine();

 
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

    
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Thuong: " + quotient);
        } else {
            System.out.println("Khong the chia cho 0");
        }

        scanner.close();
    }
}
