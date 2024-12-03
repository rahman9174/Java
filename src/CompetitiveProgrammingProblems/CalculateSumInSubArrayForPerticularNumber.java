package CompetitiveProgrammingProblems;

import java.util.Scanner;

public class CalculateSumInSubArrayForPerticularNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter the length of array : ");
//        int n = scan.nextInt();

        System.out.println("Enter the required number that you want from sub array  : ");
        int requiredNumber = scan.nextInt();

//        System.out.println("Enter the Element in the array : ");
        int[] arr = {1,2,3,7,5};

        int x = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0 ;
            for(int j = i ; j < arr.length ;  j++){
                sum = sum + arr[j];
                if(sum<= requiredNumber){
                    if(sum == requiredNumber){
                        System.out.println("got the number : ");
                    }
                    else{
                        x++;
                    }
                }else{
                    System.out.println("Not get the number in the array ");
                }
            }
        }
    }

}
