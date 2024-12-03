package CollectInterfaceV1_2.ListInterfaceV1_2.ArryListClassV1_2;
// Array list mainly have following inbuild function
    // .add()
    //.addAll()
    //.remove();

// ArrayList allows us to store the duplicate objects

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args){
        // lets creating ArrayList object first
        ArrayList<String> list1 = new ArrayList<String>();

        //adding the string type objects in the list1
        list1.add("Rahman");
        list1.add("Aman");
        list1.add("Chaman");
        list1.add("Saching");

        System.out.println("\nThis is the list1 : \n"+list1+"\n");

        // creating one more list of type string
        ArrayList<String> list2 = new ArrayList();

        list2.add("Mirza Huzefa");
        list2.add("Piyush");

        //now we are merging or adding list2 objects into list1 with the help of addAll() method
        list1.addAll(list2);

        System.out.println("After merging the list2 into the list1\n"+list1+"\n");

        // let's remove some objects from  the list;
        list1.remove(list1.size()-1);
        System.out.println("After removing the last object from the list1 : \n"+list1);



    }
}
