import java.util.Scanner;

public class Menu {
    ATMMachine atm = new ATMMachine();
    Card debitcard = new Card();
    Rajnikanth rajini = new Rajnikanth(debitcard);

    void withdraw(int pin, int amount){
        //1. Rajnikath is going to give card, pin, amount as input
        //2. The ATM machine must dispense the cash
        if(amount <= rajini.bank_balance){
            Cash cash = atm.dispense(debitcard,pin, amount);
            rajini.bank_balance =  rajini.bank_balance - amount;
            //3. On the screen (console) how much he withdrew must be displayed
            System.out.println("You have withdrawn: Rs. "+ amount);
            System.out.println("Your available Balance: " + rajini.bank_balance );
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }

    void deposit(int amount){
        rajini.bank_balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Your bank balance is: " + rajini.bank_balance);
    }

    void viewBalance(){
        System.out.println("Your ledger Balance: " + rajini.bank_balance);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        do{
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. View Balance");
                System.out.println("4. Exit");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your pin number: ");
                        int pin = scan.nextInt();
                        System.out.println("Enter the amount you need to withdraw: ");
                        int amount = scan.nextInt();
                        menu.withdraw(pin, amount);
                        break;
                    case 2:
                        System.out.println("Enter the amount to be deposited");
                        int dep_amount = scan.nextInt();
                        menu.deposit(dep_amount);
                        break;
                    case 3:
                        menu.viewBalance();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
        }while(true);
    }
}
