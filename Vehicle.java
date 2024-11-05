public class Vehicle {
    int no_of_wheels;
    String brand;
    String fuel_type;
    void getVehicleInfo(int no_of_wheels, String brand, String fuel_type){
        this.no_of_wheels = no_of_wheels;
        this.brand = brand;
        this.fuel_type = fuel_type;
    }
    void displayVehicleInfo(){
        System.out.println(this.no_of_wheels);
        System.out.println(this.brand);
        System.out.println(this.fuel_type);
    }
    void start(){
        // No implementation
    }
}
