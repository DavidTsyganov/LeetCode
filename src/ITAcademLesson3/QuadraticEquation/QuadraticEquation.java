package ITAcademLesson3.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициенты a, b, c");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double x1;
        double x2;
        double d;

        if (a != 0 && b == 0 && c == 0) {
            x1 = 0;
            System.out.println("Корень уравнения: " + x1);
        }
        else if (a != 0 && c != 0 && b == 0) {
            if (c / a < 0) {
                System.out.println("Уравнение не имеет корней");
            }
            else if (c / a > 0) {
                x1 = -Math.sqrt(c / a);
                x2 = Math.sqrt(c / a);
                System.out.println("Корни уравнения: " + x1 + "; " + x2);
            }
        }
        else if (a != 0 && b != 0 && c == 0) {
            x1 = 0;
            x2 = -b / a;
            System.out.println("Корни уравнения: " + x1 + "; " + x2);
        }
        else if (a == 0 && b == 0 && c == 0) {
            System.out.println("Корней нет");
        }
        else if (a != 0 && b != 0 && c != 0) {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("Данное уравнение не имеет действительных корней");
            }
            else if (d > 0) {
                x1 = Math.sqrt(d / (4 * Math.pow(a, 2)));
                x2 = -(Math.sqrt(d / (4 * Math.pow(a, 2))));
                System.out.println("Корни уравнения: " + x1 + "; " + x2);
            }
            else {
                x1 = - b / (2 * a);
                System.out.println("Корень уравнения: " + x1);
            }

        }

    }
}
