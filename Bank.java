public class Bank {
    void login(Card c, int pin){
        // method definition
        // method body
        // method implementation
        System.out.println("Welcome to ICICI Bank. Kindly choose one from the banking option");
        System.out.println("ATM");
    }
    void login(String username, String password, String captcha, int otp){
        System.out.println("Welcome to ICICI Bank. Kindly choose one from the banking option");
        System.out.println("InternetBanking");
    }
    void login(int mpin){
        System.out.println("Welcome to ICICI Bank. Kindly choose one from the banking option");
        System.out.println("MBanking");
    }

    public static void main(String[] args) {
        Bank atm_machine =new Bank();
        Bank internetBanking = new Bank();
        Bank mBank = new Bank();
        Card c = new Card();
        atm_machine.login(c,1212);
        internetBanking.login("muthu","muthu","We3r",45678);
        mBank.login(6789);

    }
}

// method binding:
// The process of attaching the method implementation to the method call based on the arguments passed


//Overloading Rules:

//1. The data type of the signature(parameters) must be different for two methods of same name
//2. If the data type is same, at least the number of parameters must be different
//3. If the data type is same and the number of parameters are also same, then the order of the
    //parameter must be different

//If the compiler can take the method binding decision, then it is called as compiletime polymorphism
// Static Binding
// Early method dispatch


// S.O.L.I.D

// S- Single Responsibility Principle
// O- Open Close Principle
// L- Liskov's Substitution Principle
// I- Interface Segregation Principle
// D- Dependency Inversion Principle