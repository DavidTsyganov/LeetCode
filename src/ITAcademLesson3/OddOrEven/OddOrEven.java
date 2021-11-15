package ITAcademLesson3.OddOrEven;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();

        if (a % 2 != 0) {
            if (a % 5 == 0) {
                System.out.println("Это число нечетное и кратно 5");
            }
            else {
                System.out.println("Это число нечетное и не кратно 5");
            }
        }
        else {
            if (a % 5 == 0) {
                System.out.println("Это число четное и кратно 5");
            }
            else {
                System.out.println("Это число четное и не кратно 5");
            }
        }
    }
}
