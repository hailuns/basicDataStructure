package LinkedList;

public class LinkList {
	Node head;
	//add to tail
	public void addtoTail(int n) {
		if(head == null) {
			head = new Node(n);
		}else {
			Node temp;
			temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			Node element = new Node(n);
			temp.next = element;
		} 	
	}
	//insert a Node to the front
	public void insertFront(int n) {
		if(head == null) {
			Node t =  new Node(n);
			head = t;	
		} 
		else {
			Node one = new Node(n);
			Node temp;
			temp = head;
			head = one;
			one.next = temp;
		}
	}
	//delete a Node from the linkedlist
	public Node delete(int n) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			if(head.data == n) {
				Node t = head;
				head = null;
				return t;
			}
		}
		Node pre = head;
		Node cur = pre.next;
		while(cur != null) {
			if(cur.data != n) {
				pre = pre.next;
				cur = cur.next;
			}else {
				Node temp = cur;
				pre.next = cur.next;
				return temp;
			}		
		}
		return null;
	}
	//reverse a linkedlist (interatively)
	public void reverse() {
		Node pre, cur, post;
		if(head == null || head.next == null) {
			return ;
		}
		pre = null;
		cur = head;
		post = cur.next;
		while(post != null) {
			cur.next = pre;
			pre = cur;
			cur = post;
			post = post.next;	
		}
		cur.next = pre;
		head = cur;
	}
	
	//reverse a linkedlist (recursive)
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}	
	}
}
