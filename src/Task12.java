import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание № 12");
        Scanner scanner = new Scanner(System.in);
        double disc = 0;
        double x;
        double y;
        int days = 0;
        System.out.print("Введите х: ");
        x = scanner.nextDouble();
        System.out.print("Введите y: ");
        y = scanner.nextDouble();
        while (disc < y) {
            disc += x;
            x *= 1.1;
            days++;
        }
        System.out.println(days);
    }
}
