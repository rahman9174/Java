package LinkedList;

public class InsertNodeAtBeginningLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next .next= new Node(40);

        //call the printNodes  method
        System.out.println("Before inserting the new node the linked list is looking like this : ");
        PrintLinkedListNodes.printNodes(head);


        Node newNode = new Node(200);
        //set the next value  of new  node with the  current head
        newNode.next = head;
        // set the head to the new node;
        head = newNode;
        //call the printNodes  method
        System.out.println("After insert the new node  at  the beginning, linked list is looking like this : ");
        PrintLinkedListNodes.printNodes(head);




    }
}
class PrintLinkedListNodes{
    public static void printNodes(Node head){
        while(head != null){
            if(head.next !=  null)
                System.out.print(head.data + " ---> ");
            else
                System.out.print(head.data + "  ");
            head = head.next;
        }
        System.out.println();
    }
}
