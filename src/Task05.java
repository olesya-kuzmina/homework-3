import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание №5:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isPalindrome(int number) {
        int originNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originNumber == reversedNumber;
    }
    }
