package ArraysExample;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrayElemets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of array : ");
        int n = scan.nextInt();

        System.out.println("Please enter the finding sum value : ");
        int sum = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Please enter the values in the list : ");
        for(int i = 0 ; i < n ; i++){
            list.add(scan.nextInt());
        }
        int flag = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            int num = sum  -  list.get(i);
            if(list.contains(num)) {
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
//        System.out.println(list);

    }
}
