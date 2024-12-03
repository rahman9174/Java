package LinkedList;

public class InsertNodeAtEndLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next .next= new Node(40);

        System.out.println("Before adding the node at the end of linkedlist");
        PrintLinkedListNodes.printNodes(head);

        Node newNode = new Node(500);
        InsertAtTheEnd.insertNodeAtTheEnd(head,newNode);
        System.out.println("after adding the node at the end of linkedlist");
        PrintLinkedListNodes.printNodes(head);



    }
}
class InsertAtTheEnd{
    public static  void insertNodeAtTheEnd(Node head,Node newNode){
        Node currHead = head;
        while(currHead.next != null){
            currHead = currHead.next;
        }
        currHead.next = newNode;
    }
}
// this class  is available inside  the InsertNodeAtBeginningLinkedList class
//class PrintLinkedListNodes{
//    public static void printNodes(Node head){
//        while(head != null){
//            if(head.next !=  null)
//                System.out.print(head.data + " ---> ");
//            else
//                System.out.print(head.data + "  ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//}
