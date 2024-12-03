package ClassAndObjects;
class Calculator{
    public int add(int n1,int n2){
        System.out.println("Hello this is add function");
        return n1+n2;
    }
}
public class Demo1 {
    public static void main(String[] args){
        System.out.println("Hello this is Demo class");

        int num1 = 50 ;
        int num2 = 20;

        //create  an object of Calculator class
        Calculator obj1 = new Calculator();
        int result = obj1.add(num1,num2);
        System.out.println("Result of "+num1+" and "+num2+"is : "+result);


    }
}
