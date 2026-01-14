public class Main {
    public static void main(String[] args) {
        System.out.println(" DSA Assignment \n");

        // ---------------- Q1: Doubly Linked List ----------------
        System.out.println("Q1: Doubly Linked List (DLL) ");
        Q1_DoublyLinkedList dll = new Q1_DoublyLinkedList();

        // 1) Insert at beginning: 10, 20
        dll.insertFirst(10);
        dll.insertFirst(20);

        // 2) Insert at end: 30, 40, 5, 50
        dll.insertLast(30);
        dll.insertLast(40);
        dll.insertLast(5);
        dll.insertLast(50);

        // 3) Display forward + backward
        System.out.print("Forward:  ");
        dll.displayForward();
        System.out.print("Backward: ");
        dll.displayBackward();

        // 4) Delete first node + last node
        System.out.println("deleteFirst(): " + dll.deleteFirst());
        System.out.println("deleteLast():  " + dll.deleteLast());

        System.out.print("Forward after deleteFirst & deleteLast:  ");
        dll.displayForward();

        // 5) Delete by value (20)
        // To demonstrate properly (since 20 might be deleted already), reinsert then delete by value
        dll.insertFirst(20);
        System.out.print("Forward after reinsertFirst(20): ");
        dll.displayForward();
        System.out.println("deleteByValue(20): " + dll.deleteByValue(20));
        System.out.print("Forward after deleteByValue(20): ");
        dll.displayForward();

        // 6) deleteBeforeValue(30)
        System.out.println("deleteBeforeValue(30): " + dll.deleteBeforeValue(30));
        System.out.print("Forward after deleteBeforeValue(30): ");
        dll.displayForward();

        // 7) deleteAfterValue(20)
        // Ensure 20 exists for the operation
        dll.insertFirst(20);
        System.out.print("Forward after reinsertFirst(20): ");
        dll.displayForward();
        System.out.println("deleteAfterValue(20): " + dll.deleteAfterValue(20));
        System.out.print("Forward after deleteAfterValue(20): ");
        dll.displayForward();

        // 8) Find min & max
        Integer minDll = dll.findMin();
        Integer maxDll = dll.findMax();
        System.out.println("DLL Min: " + minDll);
        System.out.println("DLL Max: " + maxDll);

        // Time complexity mention (where asked)
        System.out.println("\nTime Complexity (DLL):");
        System.out.println("- insertFirst: O(1), insertLast: O(1)");
        System.out.println("- deleteFirst: O(1), deleteLast: O(1)");
        System.out.println("- deleteByValue / deleteBeforeValue / deleteAfterValue: O(n)");
        System.out.println("- findMin / findMax: O(n)\n");


        // ---------------- Q2: Queue Implementations ----------------
        System.out.println("===== Q2: Queue Implementation =====");

        // Part A: Array queue with dynamic resizing
        System.out.println("\n--- Part A: Array Queue (dynamic resize) ---");
        Q2_ArrayQueue arrayQueue = new Q2_ArrayQueue(3); // initial size = 3
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);

        System.out.print("Queue after 3 enqueues: ");
        arrayQueue.display();

        // enqueue 40 -> should resize
        arrayQueue.enqueue(40);

        System.out.print("Queue after enqueue(40): ");
        arrayQueue.display();

        System.out.println("peek(): " + arrayQueue.peek());
        System.out.println("dequeue(): " + arrayQueue.dequeue());
        System.out.print("Queue after dequeue(): ");
        arrayQueue.display();

        System.out.println("ArrayQueue Min: " + arrayQueue.findMin());
        System.out.println("ArrayQueue Max: " + arrayQueue.findMax());

        // Part B: Linked list queue
        System.out.println("\n--- Part B: Linked List Queue ---");
        Q2_LinkedListQueue listQueue = new Q2_LinkedListQueue();
        listQueue.enqueue(10);
        listQueue.enqueue(20);
        listQueue.enqueue(30);
        listQueue.enqueue(40);

        System.out.print("LinkedListQueue: ");
        listQueue.display();

        System.out.println("peek(): " + listQueue.peek());
        System.out.println("dequeue(): " + listQueue.dequeue());
        System.out.print("After dequeue(): ");
        listQueue.display();

        System.out.println("LinkedListQueue Min: " + listQueue.findMin());
        System.out.println("LinkedListQueue Max: " + listQueue.findMax());

        // Compare array vs linked list queue
        System.out.println("\nComparison (Array Queue vs Linked List Queue):");
        System.out.println("- Enqueue: O(1) amortized (array, due to resizing) vs O(1) (linked list)");
        System.out.println("- Dequeue: O(1) vs O(1)");
        System.out.println("- Peek: O(1) vs O(1)");
        System.out.println("- Min/Max (as implemented by scanning): O(n) for both");
        System.out.println("- Memory: array uses contiguous block (may over-allocate after resizing),");
        System.out.println("          linked list uses extra pointers per node (more overhead per element)\n");


        // ---------------- Q3: Searching Algorithms ----------------
        System.out.println("===== Q3: Searching Algorithms =====");
        int[] sorted = {3, 8, 12, 20, 25, 30};

        int idx20 = Q3_Searching.binarySearchIterative(sorted, 20);
        System.out.println("Binary Search Iterative (find 20): index = " + idx20);

        int idx25 = Q3_Searching.binarySearchRecursive(sorted, 25, 0, sorted.length - 1);
        System.out.println("Binary Search Recursive (find 25): index = " + idx25);

        int idx12 = Q3_Searching.linearSearchRecursive(sorted, 12, 0);
        System.out.println("Recursive Linear Search (find 12): index = " + idx12);

        int minRec = Q3_Searching.findMinRecursive(sorted, 0);
        int maxRec = Q3_Searching.findMaxRecursive(sorted, 0);
        System.out.println("Min using recursion: " + minRec);
        System.out.println("Max using recursion: " + maxRec);

        System.out.println("\nNotes:");
        System.out.println("- Binary search requires sorted data because it decides to go left/right based on order.");
        System.out.println("- Recursive approaches use extra call stack space.");
        System.out.println("  * Binary search: Time O(log n), recursive space O(log n)");
        System.out.println("  * Linear search: Time O(n), recursive space O(n)\n");


        // ---------------- Q4: Recursion Problems ----------------
        System.out.println("===== Q4: Recursion Problems =====");
        System.out.println("factorial(5) = " + Q4_RecursionProblems.factorial(5));
        System.out.println("fibonacci(6) = " + Q4_RecursionProblems.fibonacci(6));

        int[] arrSum = {2, 4, 6, 8};
        System.out.println("sumArray({2,4,6,8}) = " + Q4_RecursionProblems.sumArray(arrSum, 0));

        int[] arrSorted = {3, 5, 7, 9};
        System.out.println("isSorted({3,5,7,9}) = " + Q4_RecursionProblems.isSorted(arrSorted, 0));

        System.out.println("minArray recursion = " + Q4_RecursionProblems.minArray(arrSum, 0));
        System.out.println("maxArray recursion = " + Q4_RecursionProblems.maxArray(arrSum, 0));
        System.out.println();


        // ---------------- Q5: Sorting Algorithms ----------------
        System.out.println("===== Q5: Sorting Algorithms =====");
        int[] data = {5, 1, 4, 2, 8};

        int[] mergeArr = Q5_Sorting.copyArray(data);
        Q5_Sorting.mergeSort(mergeArr);
        System.out.print("Merge Sort result: ");
        Q5_Sorting.printArray(mergeArr);

        int[] quickArr = Q5_Sorting.copyArray(data);
        Q5_Sorting.quickSort(quickArr, 0, quickArr.length - 1);
        System.out.print("Quick Sort result: ");
        Q5_Sorting.printArray(quickArr);

        System.out.println("\nComparison (Merge Sort vs Quick Sort):");
        System.out.println("- Merge Sort: Time O(n log n) (best/avg/worst), Space O(n)");
        System.out.println("- Quick Sort: Time O(n log n) avg/best, O(n^2) worst, Space O(log n) avg (recursion)\n");


        // ---------------- Q6: Binary Search Tree ----------------
        System.out.println("===== Q6: Binary Search Tree (BST) =====");
        Q6_BST bst = new Q6_BST();
        int[] bstValues = {50, 30, 70, 20, 40, 60, 80};
        for (int v : bstValues) bst.insert(v);

        System.out.print("Inorder:   ");
        bst.inorder();
        System.out.print("Preorder:  ");
        bst.preorder();
        System.out.print("Postorder: ");
        bst.postorder();

        System.out.println("Search 60: " + bst.search(60));
        System.out.println("Delete 80: " + bst.delete(80));

        System.out.print("Inorder after delete(80): ");
        bst.inorder();

        System.out.println("BST Min: " + bst.findMin());
        System.out.println("BST Max: " + bst.findMax());

        System.out.println("Total nodes: " + bst.countNodes());
        System.out.println("Leaf nodes:  " + bst.countLeafNodes());
        System.out.println("Tree height: " + bst.height());
    }
}