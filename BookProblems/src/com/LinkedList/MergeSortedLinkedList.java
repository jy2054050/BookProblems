package com.LinkedList;

import java.util.Scanner;

public class MergeSortedLinkedList {

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
         // display(head1);
      //    System.out.println();

          Node head2=null;
          int T2=sc.nextInt();
          while(T2-->0){
              int ele1=sc.nextInt();
              head2=insert(head2,ele1);
          }
        //  display(head2);
          
          Node newHead = Merge (head1,head2);
          display(newHead);
   } //4   1 3 5 7   4   2 4 6 8

	private static Node Merge(Node head1, Node head2) {
		Node newHead =null;
		if (head1.data < head2.data)  newHead=head1;
		else newHead=head2;
		while(head1.next != null || head2.next!=null){
			Node next1 = head1.next;
			Node next2 =head2.next;
			
			if(head1.next.data>head2.data){
				head1.next=head2;
				head2.next=next1;
				head1=head2;
				head2=next2;
			}else {
				head1=head1.next;
			}
			
		}	
		if (head1.next==null) head1.next=head2;
		else if (head2.next==null) head2.next=head1;
		return newHead;
	}
}
