package LinkedList;

public class InsertNodeAtSpecificPositionLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next= new Node(20);

        System.out.println("Before adding the node at the specific location of linkedlist");
        PrintLinkedListNodes.printNodes(head);

        int data = 30;
        int pos = 1;
        head = InsertNodeAtSpecificLocation.insertPos(head,pos,data);
        System.out.println("After adding the node at the specific location of linkedlist");
        PrintLinkedListNodes.printNodes(head);
    }
}
class InsertNodeAtSpecificLocation{
    public static Node insertPos(Node head, int pos , int data){
        // check whether the given position is valid or not
        if(pos<1){
            System.out.println("Invalid position!");
            return head;
        }
        //check if the position  pos ==1
        if(pos == 1){
            Node temp = new Node(data);
            temp.next = head;
            return head;
        }
        return head;
    }
}
