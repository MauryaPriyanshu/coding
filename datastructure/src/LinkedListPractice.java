public class LinkedListPractice {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
        Node head;

        public void addList(int data){
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
            while(currNode.next != null){
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
        public static void main(String [] args){
        LinkedListPractice list = new LinkedListPractice();

        list.addList(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();

        }

}
