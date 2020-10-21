package Zuhal;

import java.util.Stack;

public class _9PalindromeLinkedList {
	
	  public static void main(String args[]) 
	  { 
	    Node one = new Node(1); 
	    Node two = new Node(3); 
	    Node three = new Node(5); 
	    Node four = new Node(3); 
	    Node five = new Node(1); 
	    one.ptr = two; 
	    two.ptr = three; 
	    three.ptr = four; 
	    four.ptr = five; 
	  
	    boolean condition = isPalindrome(one); 
	    if(condition == true){
	      System.out.println("Linked list is a palidrome."); 

	    }
	    else{
	      System.out.println("Linked list is NOT a palidrome."); 

	    }
	  } 
	  static boolean isPalindrome(Node head) 
	  { 
	    // This pointer will allow the first traversal
	    // of the linked list
	    Node next = head; 
	    
	    boolean ispalin = true; 
	    Stack<Integer> stack = new Stack<Integer>(); 
	    
	    // Traverse the linked list and add its elements
	    // to the stack
	    while (next != null) { 
	      stack.push(next.data); 
	      next = next.ptr; 
	    } 
	    // Iterate the linked list again and  
	    // check by each element with the stack 
	    while (head != null) { 
	      int i = stack.pop(); 
	      if (head.data == i) { 
	        ispalin = true; 
	      } 
	      else { 
	        ispalin = false; 
	        break; 
	      } 
	      // Move to the next element in stack and the list 
	      head = head.ptr; 
	    } 
	    return ispalin; 
	  } 
	} 
	  
	class Node { 
	  int data; 
	  Node ptr; 
	  Node(int d) 
	  { 
	    ptr = null; 
	    data = d; 
	  } 
	} 


