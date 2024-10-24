import java.util.Scanner;
public class CoffeeVendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("1. Cappucino");
            System.out.println("2. Espresso");
            System.out.println("3. Filter Coffee");
            System.out.println("4. Exit");
            System.out.println("Enter a choice: ");
            int choice = scan.nextInt();
            if (choice == 1){
                System.out.println("Here is your Cappucino");
            }
            else if (choice == 2){
                System.out.println("Here is your Espresso");
            }
            else if (choice == 3){
                System.out.println("Here is your Filter Coffee");
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Invalid Choice");
                break;
            }
        }while(true);
    }
}
