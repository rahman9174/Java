// This peace of code is designed for the factorial with the recursion concepts

package Recursion;
public class Demo1 {
    public static void main(String[] args){
        int num = 5 ;
         int factorial = multiply(num);
        System.out.println(factorial);
    }
    public static int multiply(int num){
        if(num>=1){
            return num * multiply(num - 1);
        }
        else {
            return 1 ;

        }
    }

}
