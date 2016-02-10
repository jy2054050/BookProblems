package com.InterviewF;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTransverseTree {

/*	class Node{
		int data;
		Node left;
		Node right;
		Node(Node left,Node right, int data){
			this.left=left;
			this.right=right;
			this.data=data;
		}
	}*/
	
	private static void Transverse(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(! queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.print(tempNode.data +" ");
			if(tempNode.left !=null) queue.add(tempNode.left);
			if(tempNode.right !=null) queue.add(tempNode.right);
		}
	}
	
	public static void main(String[] args) {
		
		Node seven = new Node(null,null,7);
		Node six = new Node(null,null,6);
		Node five = new Node(null,null,5);Node four = new Node(null,null,4);
		Node two = new Node(four,five,2);Node three = new Node(six,seven,3);
		Node one = new Node(two,three,1);
		Transverse(one);
	}
}