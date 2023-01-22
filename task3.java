import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double num1 = Double.parseDouble(iScanner.nextLine());
        System.out.printf("Введите второе число: ");
        double num2 = Double.parseDouble(iScanner.nextLine());
        System.out.printf("Введите операцию число: ");
        String sign = iScanner.nextLine();
        switch (sign) {
            case "+":
                System.out.printf("Ответ: %f", num1 + num2);
                break;
            case "-":
                System.out.printf("Ответ: %f", num1 - num2);
                break;
            case "/":
                System.out.printf("Ответ: %f", num1 / num2);
                break;
            case "*":
                System.out.printf("Ответ: %f", num1 * num2);
                break;
            default:
                System.out.println("Такой операции нет");
                break;
        }
    }
}
