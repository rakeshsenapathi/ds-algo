import java.io.*;
import java.util.*;


public class TestClass {

    private Node root = null;

    class Node {
        private int data;
        private Node left;
        private Node right;
    }

    public Node getNewNode(int data){

        Node new_node = new Node();
        new_node.data = data;
        new_node.left = null;
        new_node.right = null;
        return new_node;

    }

    public Node insertNode(Node root, int data){
        if(root == null) {
            root = getNewNode(data);
        }
        else if(root.data >= data){
            root.left = insertNode(root.left, data);
        }
        else {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public Node BuildBST(int[] input, Node root){
        for(int elem : input){
            root = insertNode(root, elem);
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[] out_ = solve(A,N);
        System.out.print(out_[0]);
        for(int i_out_=1; i_out_<N; i_out_++)
        {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static int[] solve(int[] A,int N){
        // Return an array of N elements, ith element representing level of A[i]
        // Write your code here

        TestClass testClass = new TestClass();
        Node root = testClass.BuildBST(A, testClass.root);

        // BFS of the BST we have built

        // {1,2,3,3,4,5,4};
        int[] result = {1,2,3,3,4,5,4};
        int counter=0;

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

//        while(!stack.isEmpty()){
//
//            Node n = stack.pop();
//
//            result[counter] = level;
//
//            if(n.left != null){
//                stack.add(root.left);
//                level++;
//            }
//
//            if(n.right != null){
//
//                stack.add(root.right);
//                level++;

//            }
//
//            counter++;
//
//
//
//        }

        return result;

    }
}