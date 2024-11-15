package arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int s1_a[] = {10,20,30,40,50};
        int s1_b[] = {23,34,45,56,67};
        int s1_c[] = new int[s1_a.length + s1_b.length];
        System.out.println("Scenario - 1");
        System.out.println("-----------------------------");
        System.out.println("First Array Elements:");
        ArrayOps.displayArray(s1_a);
        System.out.println("Second Array Elements:");
        ArrayOps.displayArray(s1_b);
        for (int i =0;i<s1_c.length;i++){
            if (i < s1_a.length){
            s1_c[i] = s1_a[i];
            }
            else{
            s1_c[i] = s1_b[i-s1_a.length];
            }
        }
        System.out.println("Merged Array Elements:");
        ArrayOps.displayArray(s1_c);


        int s2_a[] = {12,45,23,78,67};
        int s2_b[] = {65,34,98,12,22,14};
        int s2_c[] = new int[s2_a.length + s2_b.length];
        System.out.println("Scenario - 2");
        System.out.println("-----------------------------");
        System.out.println("First Array Elements:");
        ArrayOps.displayArray(s2_a);
        System.out.println("Second Array Elements:");
        ArrayOps.displayArray(s2_b);

        int i=0,j=0,k=0;
        // Until both the arrays has same number of elements
        while(i<s2_a.length && j<s2_b.length){
            s2_c[k++] = s2_a[i++];
            s2_c[k++] = s2_b[j++];
        }
        // If the array 1's length is more than the array 2's length
        while(i<s2_a.length){
            s2_c[k++] = s2_a[i++];
        }
        //If the array 2's length is more than the array 1's length
        while(j<s2_b.length){
            s2_c[k++] = s2_b[j++];
        }
        System.out.println("Merged Array Elements:");
        ArrayOps.displayArray(s2_c);


    }
}
// Scenario1:
/* 
 * A = {10,20,30,40,50}
 * B = {23,34,45,56,67}
 * C = {10,20,30,40,50,23,34,45,56,67}
 * 
*/

// Scenario 2:
/*
 * A = {12,45,23,78,67}
 * B = {65,34,98,12,22,14}
 * C = {12,65,45,34,23,98,78,12,67,22,14}
 */

// Scenario 3:
/*
 * A = {12,22,33,43,52,61,76}
 * B = {13,16,34,56,78,89}
 * C = {12,13,16,22,33,34,43,52,56,61,76,78,89}
 */
