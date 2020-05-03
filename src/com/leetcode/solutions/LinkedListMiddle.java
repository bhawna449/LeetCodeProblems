package com.leetcode.solutions;



class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

 public class LinkedListMiddle {

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        LinkedListMiddle.middleNode(one);
    }
     
    public static ListNode middleNode(ListNode head) {
    
        ListNode node = head;
        ListNode fastHead = head;
        
        while (node != null && fastHead != null && fastHead.next != null) {
            node = node.next;
            fastHead = fastHead.next.next;
        }
        return node;
        
    }   
}
 
