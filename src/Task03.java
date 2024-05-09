public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание № 3");
        int rangeStart = 10;
        int rangeEnd = 10_000_000;
        for (int number = rangeStart; number<= rangeEnd; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }
    private static boolean isArmstrong(int number) {
        int originNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit,digits);
            number /= 10;
        }
        return sum == originNumber;
    }
    }
