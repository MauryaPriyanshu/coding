package arvind.linkedlist;

public class SingleLinkedListDemo {

     class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    Node head;

    public static void main(String[] args) {
        SingleLinkedListDemo myList = new SingleLinkedListDemo();
//        Node one = new Node(1);
//        myList.head = one;
//        Node two = new Node(2);
//        one.next = two;
//        Node three = new Node(3);
//        two.next = three;
//        Node four = new Node(4);
//        three.next = four;
//        Node five = new Node(5);
//        four.next = five;
//        Node six = new Node(6);
//        five.next = six;
//        Node seven= new Node(7);
//        six.next = seven;
//        Node eight = new Node(8);
//        seven.next = eight;
//        Node nine = new Node(9);
//        eight.next = nine;
//        Node ten = new Node(10);
//        nine.next = ten;
//        Node eleven = new Node(11);
//        ten.next = eleven;
//        Node twelve = new Node(12);
//        eleven.next = twelve;
//        Node thirteen = new Node(13);
//        twelve.next = thirteen;
//        Node fourteen = new Node(14);
//        thirteen.next = fourteen;
//        Node fifteen = new Node(15);
//        fourteen.next = fifteen;

        myList.addAtLast(30423);
        myList.addAtLast(3043243);
        myList.addAtLast(305234234);
        myList.addAtLast(30432);
        myList.printLinkedList();
    }

    void addAtLast(int data) {
        System.out.println("Adding " + data + " at last of the linked list");
        if (head == null) {
            head = new Node(data);
            return;
        }else {

            Node temp1 = head;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = new Node(data);

        }
    }

    void printLinkedList() {
        System.out.println("**********Displaying elements of linked list **************");
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
