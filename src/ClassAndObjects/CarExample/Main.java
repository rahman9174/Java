package ClassAndObjects.CarExample;

public class Main {
    public static void main(String[] args){

        //creating the objects for the Car class
        Car obj1 = new Car("Mahindra","XUV700",2025);

        Car obj2 = new Car("Suzuki","Swift",2024);

        System.out.println("Car1 Info : ");
        obj1.displayInfo();

        System.out.println("Car2 Info : ");
        obj2.displayInfo();


    }
}
