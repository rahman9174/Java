package LinkedList;

public class Example1 {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
