import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
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
}