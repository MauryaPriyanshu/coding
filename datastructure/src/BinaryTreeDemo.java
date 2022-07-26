public class BinaryTreeDemo {
    // static Node Class
        static class Node{
        int data;
        Node left;
        Node right;
        // constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
            static int index = -1;
        public static Node buildTree(int nodes[]){
             index++;
             if(nodes[index] == -1){
                 return null;
             }
             Node new_node = new Node(nodes[index]);
             new_node.left = buildTree(nodes);
             new_node.right = buildTree(nodes);

             return new_node;
        }
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args){
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
        System.out.println("Print Preorder Traversal");
            tree.preOrder(root);
            System.out.println();
        System.out.println("Print Inorder Traversal");
            tree.inOrder(root);
            System.out.println();
        System.out.println("Print Postorder Traversal");
            tree.postOrder(root);

    }
}
