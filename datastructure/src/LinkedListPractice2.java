public class LinkedListPractice2 {

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
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }

    public void addLast(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
        currNode = currNode.next;
        }
        currNode.next = new_node;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + ",");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void delete(int data){

    }

    public static void main(String[] args){
        LinkedListPractice2 list = new LinkedListPractice2();
        list.addFirst(10);
        list.printList();
        list.addLast(20);
        list.addLast(15);
        list.addLast(25);
        list.printList();
        list.addFirst(30);
        list.addFirst(35);
        list.addFirst(50);
        list.printList();
    }
}
