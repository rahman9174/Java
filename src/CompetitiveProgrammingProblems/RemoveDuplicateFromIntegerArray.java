package CompetitiveProgrammingProblems;

import java.util.*;


public class RemoveDuplicateFromIntegerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you  want to enter : ");
        int n = scan.nextInt();

        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0 ; i< n+1 ; i++){
            set.add(scan.nextInt());
        }
//        System.out.println(set);

        System.out.println("this  output is coming from enhanced for loop : -----");
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }

//        with iterator
        System.out.println("\nThis output  is coming from the  Iterator : -----");
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
    }
}
