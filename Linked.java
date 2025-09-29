import java.util.Scanner;

class Node {
    Node next;
    int val;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Linked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Node head = null, tail = null;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Middle element: " + findMiddle(head));
        sc.close();
    }

    public static int findMiddle(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int mid = length / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}