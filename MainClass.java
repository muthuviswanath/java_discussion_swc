public class MainClass {
    public static void main(String[] args) {
        Card c = new Card();
        Rajnikanth rajini = new Rajnikanth(c);
        ATMMachine atm =new ATMMachine();
        Cash money = atm.dispense(rajini.debitcard, 1221, 50000);
        System.out.println(money);
    }
}
