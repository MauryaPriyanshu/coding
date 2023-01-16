public class ReverseLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addFirst(int data){
        Node new_Node = new Node(data);
        if(head == null){
            head = new_Node;
            return;
        }
        new_Node.next = head;
        head = new_Node;

    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " - ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.printList();
        head = list.reverse(head);
    }
}
