import java.util.*;
//**************Create a public class Name SLinkedList*************************
public class SLinkedList {
    Node head;
    private int size;
    public SLinkedList(){
        this.size = 0;
    }
    //*********************** New class name Node********************************
    class Node {
        int data;
        Node next;

        //*********************** Cunstructor ********************************
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //********************** add - First***************
        public void addFirst(int data) {
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                return;
            }
            new_node.next = head;
            head = new_node;
        }
        // **************************** add- Last******************
        public void addLast(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr_node = head;
        while(curr_node.next != null){
            curr_node = curr_node.next;
        }
        curr_node.next = new_node;
        }
        //************************* Print List **************************
        public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr_node = head;
        while(curr_node != null){
            System.out.print(curr_node.data + "->");
            curr_node = curr_node.next;
        }
            System.out.println("null");
        }
        //************************* delete- first*************************
        public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        }
        //**************************** delete - last**************************
        public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!");
            head = head.next;
        }
            if(head.next == null){
                head = null;
                return;
            }
        Node secondLast = head;
        Node lastNode  = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

        }

        public static void main(String[] args) {
            SLinkedList list = new SLinkedList();
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            list.printList();
            list.addLast(4);
            list.addLast(5);
            list.addLast(6);
            list.printList();
            list.deleteFirst();
            list.printList();
            list.deleteLast();
            list.printList();
        }
    }

