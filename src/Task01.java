import java.util.Scanner;

public class Task01 {
    static int COUNT = 0;

    public static void main(String[] args) {
        System.out.println("Задание № 1: Числа Фиббоначи");
        int f1 = 0;
        int f2 = 1;
        for (int f3 = 0; f3 <= 10000000; f3++) {
            System.out.print(f3 + ", ");
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
