public class Car extends Vehicle{

    @Override
    void start(){
        System.out.println(this.brand + " gets started by the touch of a button");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.getVehicleInfo(4, "Yamaha", "Electric");
        c.displayVehicleInfo();
        c.start();
    }
}
