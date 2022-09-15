public class LinkedListExample {
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;
    private int size ;

    LinkedListExample(){
        this.size = 0;
    }

    public void addFirst(String data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(String data) {
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = temp;
    }

    public void printList(){
        if(head == null){
            System.out.print("List is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is Empty!!");
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty!!");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public void addMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid index value!!");
            return;
        }
        Node temp = new Node(data);
        if (head == null || index == 0) {
            temp.next = head;
            head = temp;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = temp;
                temp.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }


    public static void main(String[] args){
        LinkedListExample LL = new LinkedListExample();

        LL.addFirst("Priya");
        LL.addFirst("Anshu");

        LL.printList();

        LL.addLast("maurya");
        LL.addLast("is");

        LL.printList();

        LL.deleteFirst();

        LL.printList();

        LL.deleteLast();

        LL.addMiddle(12, "Hello");

        LL.printList();

        System.out.println(LL.getSize());




        }
    }

