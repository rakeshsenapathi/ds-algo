import java.util.Scanner;

/**
 * Created by Senapathi on 14-10-2017.
 */


class SingleList {

    private Node head;

    class Node {

        private int data;

        private Node next;

        Node(int d) {

            data = d;

            next = null;

        }
    }

    private void append(int data) {

        Node new_node = new Node(data);

        if (head == null) {

            head = new_node;
            new_node.next = null;
            return;

        }


        Node last = head;

        while (last.next != null) {

            last = last.next;
        }

        last.next = new_node;
        return;

    }

    private void push(int data) {


        Node new_node = new Node(data);

        if (head == null) {

            head = new_node;
            new_node.next = null;
            return;

        }
        new_node.next = head;
        head = new_node;
        return;


    }

    private void insertAfter(int position, int new_data) {

        Node last = head;

        if (head == null) {
            System.out.print("Invalid attempt");
            return;
        }

        for (int i = 0; last.next != null && i < position - 1; i++) {
            last = last.next;
        }

        Node new_node = new Node(new_data);
        new_node.next = last.next;
        last.next = new_node;
        return;


    }

    private void delete(int new_data) {

        Node temp = head, last = null;


        if (head == null) return;

        if (temp != null && temp.data == new_data) {
            head = temp.next; // Changed head
            return;
        }

        while (temp != null && temp.data != new_data) {
            last = temp;

            temp = temp.next;

        }

        if (temp == null) return;

        last.next = temp.next;


    }


    private void printlist() {

        Node node = head;

        while (node != null) {

            System.out.print(" ---> " + node.data);
            node = node.next;
        }


    }

    public static void main(String args[]) {

        SingleList s_list = new SingleList();

        char ch;

        do {
            System.out.println("1. Push 2. Append 3. Delete 4. InsertAfter");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter value: ");
                    s_list.push(sc.nextInt());
                    s_list.printlist();
                    break;

                case 2:
                    System.out.println("Enter value: ");
                    s_list.append(sc.nextInt());
                    s_list.printlist();
                    break;
                case 3:
                    System.out.println("Enter value: ");
                    s_list.delete(sc.nextInt());
                    s_list.printlist();
                    break;
                case 4:
                    System.out.println("Enter position,data");
                    s_list.insertAfter(sc.nextInt(), sc.nextInt());
                    s_list.printlist();
                    break;


                default:
                    System.out.println("Enter valid choice");
                    break;
            }


            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);


        } while (ch == 'Y' || ch == 'y');


    }


}