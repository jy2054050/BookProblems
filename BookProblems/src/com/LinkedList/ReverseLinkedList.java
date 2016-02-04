package com.LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
	public static  Node insert(Node head,int data)
	{
		
		if (head==null){
			head=new Node(data);
		return head;
		}else {
			
			 Node currentNode = head;
		        while(currentNode.next != null){
		        currentNode = currentNode.next;
               }
             currentNode.next = new Node(data);
		        return head;
		}
		
  	//Complete this method
	}
	
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head1=null;
          int T1=sc.nextInt();
          while(T1-->0){
              int ele=sc.nextInt();
              head1=insert(head1,ele);
          }
         head1= Reverse(head1);
          display(head1);
        
   } //4   1 3 5 7  

	private static Node Reverse(Node head) {
		Node next= head.next;
		Node prv=null;
		while(head.next !=null){
			head.next=prv;
			prv=head;
			head=next;
			next=head.next;
		}
		head.next=prv;
		return head;
		
	}
}