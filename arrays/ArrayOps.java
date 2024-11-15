package arrays;

public class ArrayOps {
    // Display the OneD array as [ele1, ele2, .... elen]

    static void displayArray(int a[]){
        if (a == null){
            System.out.println("null");
        }
        int lastele = a.length-1;
        if (lastele == -1){
            System.out.println("[]");
        }
        else{
            System.out.print("[");
            for(int i=0; i<a.length; i++){
                System.out.print(a[i]);
                if (i == lastele){
                    System.out.print("]");
                }
                else{
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
