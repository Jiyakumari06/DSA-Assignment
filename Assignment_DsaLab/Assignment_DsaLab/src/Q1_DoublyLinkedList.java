public class Q1_DoublyLinkedList {
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Insert at beginning: O(1)
    public void insertFirst(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    // Insert at end: O(1) because we keep a tail pointer
    public void insertLast(int value) {
        Node n = new Node(value);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    // Forward traversal: O(n)
    public void displayForward() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) System.out.print(" <-> ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Backward traversal: O(n)
    public void displayBackward() {
        Node cur = tail;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.prev != null) System.out.print(" <-> ");
            cur = cur.prev;
        }
        System.out.println();
    }

    // Delete first node: O(1)
    public Integer deleteFirst() {
        if (head == null) return null;

        int val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Delete last node: O(1)
    public Integer deleteLast() {
        if (tail == null) return null;

        int val = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Delete a node by value: O(n)
    public boolean deleteByValue(int value) {
        Node cur = head;
        while (cur != null && cur.data != value) cur = cur.next;

        if (cur == null) return false; // not found

        unlink(cur);
        return true;
    }

    // Delete the node before a given value: O(n)
    public boolean deleteBeforeValue(int value) {
        Node cur = head;
        while (cur != null && cur.data != value) cur = cur.next;

        if (cur == null) return false;          // value not found
        if (cur.prev == null) return false;     // no node before (cur is head)

        unlink(cur.prev);
        return true;
    }

    // Delete the node after a given value: O(n)
    public boolean deleteAfterValue(int value) {
        Node cur = head;
        while (cur != null && cur.data != value) cur = cur.next;

        if (cur == null) return false;          // value not found
        if (cur.next == null) return false;     // no node after (cur is tail)

        unlink(cur.next);
        return true;
    }

    // Find min value in DLL: O(n)
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

    // Find max value in DLL: O(n)
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

    // Helper to unlink a node safely (maintains next/prev, head/tail)
    private void unlink(Node node) {
        if (node == null) return;

        if (node == head && node == tail) {
            head = tail = null;
        } else if (node == head) {
            head = head.next;
            head.prev = null;
        } else if (node == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
    }
}