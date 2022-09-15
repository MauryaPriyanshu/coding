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

    public void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = new_node;

    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + ",");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
       Node newHead =  reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();
//        list.reverseIterate();
//        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
