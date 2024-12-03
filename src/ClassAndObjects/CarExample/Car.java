package ClassAndObjects.CarExample;

public class Car {
   //  fields or attributes
    String brandName;
    String model;
    int year;

    //creating construct for the Car class( a special method for initializing objects)
    public Car(String  brandName, String model , int year){
        this.brandName = brandName;
        this.model = model;
        this.year = year;
    }

    // moehtod to display the information about  the car
    public void displayInfo(){
        System.out.println("Brand Name : "+brandName);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }
}
