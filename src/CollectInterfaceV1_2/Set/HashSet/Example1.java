package CollectInterfaceV1_2.Set.HashSet;
// In set we can store unique number and set doesn't allow the duplicate data
// set store the data in  a sorted form

import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        // creating the set object
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(0);
        set.add(100);
        set.add(22);
        set.add(99);
        set.add(2);
        set.add(100);
        System.out.println("Set values are : "+set);
    }
}
