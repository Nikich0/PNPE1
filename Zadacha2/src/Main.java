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
        arrReverse(arr1);

        scanner.close();
    }
    public static void arrReverse(int[] arr1){
        int[] arrRev = new int[10];
        for(int i = 0; i < arr1.length; i++)
        {
            arrRev[i] = arr1[arr1.length - 1 -i];
        }
        System.out.print("Reverse array: ");
        for(int i = 0; i < arrRev.length; i++)
        {
            System.out.print(arrRev[i] + " ");
        }
    }
}