public class Alpha {

    void display(){
        System.out.println("Hi");
    }
}

class Beta extends Alpha{

    @Override
    void display(){
        System.out.println("Welcome to Beta Class");
    }
}
