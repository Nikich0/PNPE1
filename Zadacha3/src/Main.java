import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Original array: ");
        for(int i = 0; i < arr1.length; i++ )
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        arrMax(arr1);
        arrMin(arr1);

        scanner.close();
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
}