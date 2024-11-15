package arrays;

import java.util.Scanner;

public class SplitArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int size= scan.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array elements");
        for(int i=0; i<size;i++){
            System.out.println("Enter the value for element " + (i+1)+": ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Existing Array Elements: ");
        ArrayOps.displayArray(arr);
        System.out.println("Enter the number of elements to be stored in the first array: ");
        int a1_size = scan.nextInt();
        int a1[] = new int[a1_size];
        int b1[] = new int[size - a1_size];
        for(int i=0;i<size;i++){
            if (i<a1.length){
                a1[i]= arr[i]; 
            }
            else{
                b1[i-a1.length]=arr[i];
            }
        }
        System.out.println("First Array");
        ArrayOps.displayArray(a1);
        System.out.println("Second Array");
        ArrayOps.displayArray(b1);
    }
}
