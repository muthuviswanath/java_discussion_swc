public class Moverload {


    void display(double a){
        System.out.println("Double");
    }

    void display(float a){
        System.out.println("Float");
    }

    void display(Card c){
        System.out.println("Card");
    }

    void display(String s){
        System.out.println("String");
    }
    public static void main(String[] args) {
        Moverload m = new Moverload();
        m.display(10);
        m.display(null);
    }
}
