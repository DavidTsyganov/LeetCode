package ITAcademLesson3.TriangularArea;

import java.util.Scanner;

public class TriangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Х первой точки: ");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координату Y первой точки: ");
        double y1 = scanner.nextDouble();
        System.out.println("Введите координату Х второй точки: ");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координату Y второй точки: ");
        double y2 = scanner.nextDouble();
        System.out.println("Введите координату Х третьей точки: ");
        double x3 = scanner.nextDouble();
        System.out.println("Введите координату Y третьей точки: ");
        double y3 = scanner.nextDouble();

        double a = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        double b = Math.sqrt((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2)));
        double c = Math.sqrt((Math.pow((x1 - x3), 2)) + (Math.pow((y1 - y3), 2)));

        double p = (a + b + c) / 2;
        double area;

        if ((x1 == x2 && x2 == x3 && x1 == x3) || (y1 == y2 && y2 == y3 && y1 == y3) ) {
            System.out.println("Это не треугольник, а отрезок. Площадь не вычисляется.");
        }
        else {
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь треугольника: " + area);
        }

    }
}
