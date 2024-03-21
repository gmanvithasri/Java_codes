import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    ListNode head;

    // Method to add a new node at the end of the list
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to count the number of nodes in the list
    public int countNodes() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to display the list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int nodeData = scanner.nextInt();
            list.add(nodeData);
        }

        System.out.println("Created Singly Linked List:");
        list.display();

        int count = list.countNodes();
        System.out.println("Number of nodes in the list: " + count);
    }
}
