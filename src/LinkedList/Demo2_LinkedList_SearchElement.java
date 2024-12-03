package LinkedList;

import java.util.Scanner;

public class Demo2_LinkedList_SearchElement {
    public static void main(String[] args) {
        int numSearch;
        Scanner scan = new Scanner(System.in);
        Node head =  new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =new Node(40);
        System.out.println("Enter the  number you want to search in the linkedlist...");
        numSearch = scan.nextInt();
//        SearchElementInLinkedList.searchElementInLinkedListMethod(head,numSearch);
        System.out.println(SearchElementInLinkedList.searchElementInLinkedListMethod(head,numSearch));
    }
}
class SearchElementInLinkedList{
    public static boolean searchElementInLinkedListMethod(Node head,int numSearch){
        while(head != null){
            System.out.println(head.data + " ----> ");
            if(numSearch == head.data){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
