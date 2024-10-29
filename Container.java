public class Container {
    void storeData(Water w){
        System.out.println("This container contains: " + w);
    }

    void storeData(Sand s){
        System.out.println("This container contains: " + s);
    }

    void storeData(Petrol p){
        System.out.println("This container contains: " + p);
    }
}

class Water {}
class Sand{}
class Petrol{}
