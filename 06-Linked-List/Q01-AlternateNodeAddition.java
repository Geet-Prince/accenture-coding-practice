/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-LL-H01
Title         : Alternate Node Addition (Next-to-Next)
Historical Status : PROBABLE
Reported Year(s)  : 2022
Topic         : Linked List — Modification
Difficulty    : MEDIUM-HARD
Accenture Pattern : LOW (single report, 2022 only)
Source        : GFG 2022 Advanced ASE slots, PrepInsta
============================================================
PROBLEM
============================================================
Given a singly linked list, update each node's value by
ADDING the value of the node two positions ahead (next-next).
Modify in-place. The last two nodes remain unchanged.

============================================================
EXAMPLE 1
============================================================
Input:  1 → 2 → 3 → 4 → 5 → 6 → 7
Output: 1 → 2 → 4 → 6 → 8 → 10 → 12

Explanation:
  Node 1 (val=1): next-next is node 3 (val=3) → 1+3=4? 
  Wait — re-read: each node gets its OWN value + next-next value
  Node 3: 3 + next-next (5) = 8? No — let me re-check source.

  RECONSTRUCTED interpretation (most common PrepInsta version):
  From node at index 0 (val=1): add value of node at index 2 (val=3) → becomes 4
  Actually PrepInsta shows: 1→2→4→6→8→10→12 from 1→2→3→4→5→6→7
  This means: node[i] += node[i+2] for i where i+2 exists

============================================================
EDGE CASES
============================================================
1. List with < 3 nodes → no changes
2. null head → return null
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

public class Q01AlternateNodeAddition {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static Node addAlternate(Node head) {
        if (head == null) return null;
        // Write your solution here
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printList(addAlternate(head));
    }
}
