public class Q2_LinkedListQueue {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head; // front
    private Node tail; // rear
    private int size;

    // Enqueue: O(1)
    public void enqueue(int value) {
        Node n = new Node(value);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    // Dequeue: O(1)
    public Integer dequeue() {
        if (head == null) return null;
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    // Peek: O(1)
    public Integer peek() {
        return (head == null) ? null : head.data;
    }

    // Display: O(n)
    public void display() {
        if (head == null) {
            System.out.println("(empty)");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Min: O(n)
    public Integer findMin() {
        if (head == null) return null;
        int min = head.data;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data < min) min = cur.data;
            cur = cur.next;
        }
        return min;
    }

    // Max: O(n)
    public Integer findMax() {
        if (head == null) return null;
        int max = head.data;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data > max) max = cur.data;
            cur = cur.next;
        }
        return max;
    }

    public int size() {
        return size;
    }
}
