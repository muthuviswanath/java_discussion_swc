package arrays;

public class OneDimension {
    
    public static void main(String[] args) {
        //Early Initialization
        // Syntax:
        // datatype []array_name = {ele1,ele2,......elen}
        // datatype[] array_name = {ele1,ele2,......elen}
        // datatype array_name[] = {ele1,ele2,......elen}

        // Late Initialization
        // datatype array_name[];
        // datatype array_name[] = new datatype[size]
        // array_name[0] = ele1
        // array_name[1] = ele2
        // ...
        // ...
        // ...
        // array_name[n] = elen
        int arr[] = {10,20,30,40,50};
        double d[] = new double[5];
        d[0] = 12.34;
        d[1] = 34.45;
        d[2] = 12.12;
        d[3] = 45.67;
        d[4] = 78.23;
        ArrayOps.displayArray(arr);
    }
}
