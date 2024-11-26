import java.util.Scanner;

public class EquationSolver {
    
    // Phương pháp giải phương trình bậc nhất một ẩn
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la  " + x);
        }
    }
    
    public static void solveLinearSystem(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiem cua he phuong trinh la: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    
    // Phương pháp giải phương trình bậc hai
    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
 
            System.out.println("Phuong trinh tro thanh phuong trinh bac nhat.");
            solveLinearEquation(b, c);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Giải phương trình bậc nhất một ẩn
        System.out.println("Nhap he so phuong trinh bac nhat (ax + b = 0):");
        System.out.print("a = ");
        double a1 = scanner.nextDouble();
        System.out.print("b = ");
        double b1 = scanner.nextDouble();
        solveLinearEquation(a1, b1);
        
        // Giải hệ phương trình bậc nhất hai ẩn
        System.out.println("\nNhap he so he phuong trinh bac nhat hai an:");
        System.out.print("a11 = ");
        double a11 = scanner.nextDouble();
        System.out.print("a12 = ");
        double a12 = scanner.nextDouble();
        System.out.print("b1 = ");
        double b2_1 = scanner.nextDouble();
        System.out.print("a21 = ");
        double a21 = scanner.nextDouble();
        System.out.print("a22 = ");
        double a22 = scanner.nextDouble();
        System.out.print("b2 = ");
        double b2_2 = scanner.nextDouble();
        solveLinearSystem(a11, a12, b2_1, a21, a22, b2_2);
        
        // Giải phương trình bậc hai
        System.out.println("\nNhap he so phuong trinh bac hai (ax^2 + bx + c = 0):");
        System.out.print("a = ");
        double a2 = scanner.nextDouble();
        System.out.print("b = ");
        double b2 = scanner.nextDouble();
        System.out.print("c = ");
        double c2 = scanner.nextDouble();
        solveQuadraticEquation(a2, b2, c2);
        
        scanner.close();
    }
}
