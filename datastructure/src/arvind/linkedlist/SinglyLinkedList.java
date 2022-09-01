package arvind.linkedlist;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    public void addLast(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node lnode = head;
        while(lnode != null){
            lnode = lnode.next;
        }
        lnode.next = new Node(data);
    }

    public void printList() {
        if (head == null) {
            System.out.print("List is empty!!");
            return;
        }
        Node printnode = head;
        while (printnode != null) {
            System.out.print(printnode.data + ",");
            printnode = printnode.next;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(" Print the list!!");
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(6);
        list.printList();
    }
}
