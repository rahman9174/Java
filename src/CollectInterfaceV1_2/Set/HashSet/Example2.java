package CollectInterfaceV1_2.Set.HashSet;

// find the sum of unique  element of two array :

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter set1 size :  \n");
        int n1 = scan.nextInt();

        Set<Long> set1 = new HashSet<>();
        Set<Long> set2 = new HashSet<>();

        System.out.println("Please enter the elements in the set1");
        for(int i = 0;i<n1; i++) {
            set1.add(scan.nextLong());
        }
        System.out.println(set1);

        System.out.println("Please enter the size of  set2 : ");
        int n2 = scan.nextInt();

        System.out.println("Please enter the elements in the set2");
        for(int i = 0 ; i<n2 ; i++){
            set2.add(scan.nextLong());
        }
        System.out.println(set2);

         Iterator itr = set1.iterator();
         long sum = 0 ;
        while(itr.hasNext()){
            long num = (long) itr.next();
            if(set2.contains(num)){
                sum += num;
            }
        }
        System.out.println("The sum of 2 set of unique elements : "+sum);


    }
}
