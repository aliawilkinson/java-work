package com.alia.linkedlist;

public class Node {
	
	private int id;
	
	private Node next;
	
	//constructor
	public Node(int id, Node next) {
		this.id = this.setid(id);
		this.next = this.setNext(next);
	}
	
	public String toString() {
		return id + "";
	}
	
	//add function
	public Node add(Node node) {
		Node current = this;
		while(current.next != null) {
			current = current.next;
		}
		return node;
	}
	
	//getters and setters
	public int getid(){
		return id;
	}
	
	public int setid(int id){
		this.id = id;
		return id;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node setNext(Node next){
		this.next = next;
		return next;
	}
}
