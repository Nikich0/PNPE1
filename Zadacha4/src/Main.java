import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(isPrime(x))
        {
            System.out.println(x + " is prime!");
        }
        else
        {
            System.out.println(x + " is not prime!");
        }

        scanner.close();
    }
    public static boolean isPrime(int x) {
        if (x <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}