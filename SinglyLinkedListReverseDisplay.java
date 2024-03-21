import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    ListNode head;

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

    public void displayReverse(ListNode node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data + " -> ");
    }
}

public class SinglyLinkedListReverseDisplay {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Singly Linked List in reverse order:");
        list.displayReverse(list.head);
        System.out.println("NULL");
    }
}
