public class EnhancedFor {
    public static void main(String[] args) {
        String colors[] = {"Red", "Blue", "Green"};

        //Traditional for loop can be used to print the elements in both the directions
        for(int i=colors.length-1; i>=0; i--){
            System.out.println(colors[i]);
        }

        //Enhanced For loop can be used to print the element in forward direction only
        for(String s:colors){
            System.out.println(s);
        }
    }
}
