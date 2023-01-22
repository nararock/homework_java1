public class task2 {
    static boolean isPrime(int n) {
        for (int j = 2; j <= Math.floor(Math.sqrt(n)); j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i))
                System.out.printf("%d ", i);
        }
    }
}
