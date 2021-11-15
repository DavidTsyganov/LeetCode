package ITAcademLesson3.Password;
import java.util.Scanner;

public class Password {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хранимый пароль: ");
        String passwordTrue = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String userPassword = scanner.nextLine();

        if (passwordTrue.equals(userPassword)) {
            System.out.println("Пароль верный");
        }
        else {
            if (passwordTrue.length() < userPassword.length()) {
                System.out.println("Пароль неверный, строка слишком длинная");
            }
            else if (passwordTrue.length() > userPassword.length()) {
                System.out.println("Пароль неверный, строка слишком короткая");
            }
            else {
                System.out.println("Пароль неверный");
            }
        }
    }
}
