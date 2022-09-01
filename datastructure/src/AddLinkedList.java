public class AddLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node head;

         public void addFirst(int data){
            Node new_node = new Node(data);
            if(head == null)
            {
                head = new_node;
            return;
            }
            new_node.next = head;
            head = new_node;
         }

//         public void addLast(int data){
//             Node new_node = new Node(data);
//             if(head == null){
//                 head = new_node;
//                 return;
//             }
//             Node currNode = head;
//             while(currNode.next != null){
//                 currNode = currNode.next;
//             }
//             currNode.next = new_node;
//         }

         public void printList(){
             if(head == null){
                 System.out.println("List is empty");
                 return;
             }
             Node currnode = head;
             while(currnode != null){
                 System.out.print(currnode.data + "->");
                 currnode = currnode.next;
             }

         }

    public static void main(String[] args){
            AddLinkedList list = new AddLinkedList();
            list.addFirst(1);
            list.addFirst(2);


            list.addFirst(3);
            list.addFirst(4);
            list.printList();
         }

}




