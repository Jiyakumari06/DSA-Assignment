📘 Data Structures & Algorithms – Assignment



📌 Introduction
This is a DSA class assignment written in Java without using any built-in collections like ArrayList or LinkedList. Each question is implemented in a separate class, and all required functions are called from the Main.java file. Time complexity is mentioned below.



Q!Doubly Linked List (DLL)
Time Complexity (DLL)
insertFirst, insertLast: O(1)
deleteFirst, deleteLast: O(1)
deleteByValue, deleteBeforeValue, deleteAfterValue: O(n)
findMin, findMax: O(n)



Q2: Queue Implementation
Array Queue
Enqueue: O(1) amortized (resize is O(n) occasionally)
Dequeue/Peek: O(1)
Memory: contiguous array; may over-allocate after resizing
Linked List Queue
Enqueue/Dequeue/Peek: O(1)
Memory: extra pointer overhead per node; no resizing required
Min/Max (as implemented by scanning): O(n) for both


Q3: Searching Algorithms
Binary Search: O(log n) time
Iterative space: O(1)
Recursive space: O(log n) (call stack)
Recursive Linear Search: O(n) time, O(n) space
Min/Max using recursion: O(n) time, O(n) space



Q4: Recursion Problems


Q5: Sorting Algorithms
Merge Sort vs Quick Sort
Merge Sort: Time O(n log n) (best/avg/worst), Space O(n)
Quick Sort: Time O(n log n) avg/best, O(n²) worst, Space O(log n) avg (recursion)


Q6: Binary Search Tree (BST)
BST Complexity 
Insert/Search/Delete: O(log n) average, O(n) worst-case
Traversals/Counts/Height: O(n)

