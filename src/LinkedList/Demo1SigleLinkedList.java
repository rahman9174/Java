package LinkedList;

public class Demo1SigleLinkedList {
    public static void main(String[] args){
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);

        TraverseList.traverseLinkedList(head);

    }
}
 class TraverseList{
    public static void traverseLinkedList(Node head){
        while(head != null ){
            System.out.println(head.data + " next ref value ---> "+head.next);
            head = head.next;
        }
        System.out.println();
    }
}

