import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = scanner.nextInt();
        }
        arrSum(arr1);
        arrEven(arr1);
        arrOdd(arr1);
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
}