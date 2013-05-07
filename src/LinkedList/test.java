package LinkedList;

public class test {
	public static void main(String[] args) {
		LinkList n = new LinkList();
		n.addtoTail(5);n.addtoTail(4);n.addtoTail(3);n.addtoTail(2);n.addtoTail(1);
		
		n.insertFront(0);
		//n.print();
		//n.delete(3);
		//n.delete(2);
		n.print();
		n.reverse();
		n.print();
		
		
	}
}
