public class LinkedListRemoval {
    class Node {
        int data;
        Node next;

        Node(int data) {
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
        System.out.println("null");
    }

    public void removeNthFromEnd(int n){
        if(head.next == null){
            System.out.print("null");
            return ;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size)
        {
            System.out.println(head.next);
            return ;
        }
        int indexToSearch = size - n;
        Node prev = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        System.out.print(head);
        return ;
    }

        public static void main(String[] args){
            LinkedListRemoval list = new LinkedListRemoval();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.printList();
            list.removeNthFromEnd(3);
            list.printList();
        }
    }

