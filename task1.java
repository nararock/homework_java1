import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = Integer.parseInt(iScanner.nextLine());

        System.out.printf("Сумма чисел от 1 до %d равна %d \n", number, (number * (number + 1)) / 2);
        System.out.printf("Произведение чисел от 1 до %d равно %d", number, factorial(number));
    }
}