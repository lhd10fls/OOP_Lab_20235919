import java.util.Scanner;

public class Equation {
    public static void LinearEquation () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        }
    }

    public static void LinearSystem () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coefficients for the system:");
        System.out.print("a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("b2: ");
        double b2 = scanner.nextDouble();
        
        double D = (a11 * a22) - (a21 * a12);
        double D1 = (b1 * a22) - (b2 * a12);
        double D2 = (a11 * b2) - (a21 * b1);
        
        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Unique solution:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }
        
        scanner.close();
    }

    public static void SecondDegreeEquation () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

if (a == 0){
    if (b == 0){
        if (c == 0){
            System.out.println("The equation has many solutions.");
        } else {
            System.out.println("The equation has no solution.");
        }
    } else {
        double x = -c / b;
        System.out.println("The solution is: x = " + x);
    }
} else {
            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two real roots: " + root1 + " and " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
            } else {
                System.out.println("No real roots.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of equation:");
        System.out.println("1. Linear equation");
        System.out.println("2. Linear system");
        System.out.println("3. Second degree equation");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                LinearEquation();
                break;
            case 2:
                LinearSystem();
                break;
            case 3:
                SecondDegreeEquation();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
