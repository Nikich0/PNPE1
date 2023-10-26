import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Input array of 5 elements:");
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = scanner.nextInt();
        }
        arrSum(arr1);
        arrEven(arr1);
        arrOdd(arr1);
        arrReverse(arr1);
        arrMax(arr1);
        arrMin(arr1);
        System.out.println("Input a number:");
        int x = scanner.nextInt();
        if(isPrime(x))
        {
            System.out.println(x + " is prime!");
        }
        else
        {
            System.out.println(x + " is not prime!");
        }
        int[][] matrix1 = new int[3][3];
        System.out.println("Input a matrix with 3 columns and 3 rows:");
        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1.length; j++)
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1.length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        diagCalc(matrix1);
        diagCalc2(matrix1);

        scanner.close();
    }
    public static void arrSum(int[] arr1){
        int sum = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            sum += arr1[i];
        }
        System.out.println("The sum of all numbers is: " + sum);
    }
    public static void arrEven(int[] arr1){
        int sum = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] % 2 == 0)
            {
                sum += arr1[i];
            }
        }
        System.out.println("The sum of all even numbers is: " + sum);
    }
    public static void arrOdd(int[] arr1){
        int sum = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                sum += arr1[i];
            }
        }
        System.out.println("The sum of all odd numbers is: " + sum);
    }
    public static void arrReverse(int[] arr1){
        int[] arrRev = new int[5];
        for(int i = 0; i < arr1.length; i++)
        {
            arrRev[i] = arr1[arr1.length - 1 -i];
        }
        System.out.print("Reverse array: ");
        for(int i = 0; i < arrRev.length; i++)
        {
            System.out.print(arrRev[i] + " ");
        }
        System.out.println();
    }
    public static void arrMax(int[] arr1){
        int max = arr1[0];
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] > max)
            {
                max = arr1[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
    public static void arrMin(int[] arr1){
        int min = arr1[0];
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] < min)
            {
                min = arr1[i];
            }
        }
        System.out.println("Min number is: " + min);
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
    public static void diagCalc(int[][] matrix1) {
        int sum = 0;
        for(int i = 0; i < matrix1.length; i++)
        {
            sum += matrix1[i][i];
        }
        for (int i = 0; i < matrix1.length; i++) {
            sum += matrix1[i][matrix1.length - 1 - i];
        }
        System.out.println("The sum of both diagonals is: " + sum);
    }
    public static void diagCalc2(int[][] matrix1) {
        int sum = 0;
        for(int i = 0; i < matrix1.length; i++)
        {
            sum += matrix1[i][i];
        }
        for (int i = 0; i < matrix1.length; i++) {
            if(i != (matrix1.length) - 1 - i) {
                sum += matrix1[i][matrix1.length - 1 - i];
            }
        }
        System.out.println("The sum of both diagonals without center digit repeating is: " + sum);
    }
}