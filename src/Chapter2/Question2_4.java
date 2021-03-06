package Chapter2;

public class Question2_4 {
	public static Node partitionLink(Node head, int x){
		Node p1 = null;
		Node p2 = null;
		Node p1head = null;
		Node p2head = null;
		
		while(head != null){
			Node next = head.next;
			head.next = null;
			if(head.data < x){
				if(p1head == null){
					p1head = head;
					p1 = p1head;
				}else{
					p1.next = head;
					p1 = p1.next;
				}
			}else{
				if(p2head == null){
					p2head = head;
					p2 = p2head;
				}else{
					p2.next = head;
					p2 = p2.next;
				}
			}
			head = next;
		}
		if(p1head==null){
			return p2head;
		}
		p1.next = p2head;
		return p1head;
		
	}
	
	public static Node partitionLink2(Node head, int x){
		
		// we can insert the new node into the front of partitioned nodes;
		Node p1head = null;
		Node p2head = null;
		while(head != null){
			Node next = head.next;
			if(head.data < x){
				head.next = p1head;
				p1head = head;
			}else{
				head.next = p2head;
				p2head = head;
			}
			if(p1head == null){
				return p2head;
			}
			head = next;
		}
		
		Node start = p1head;
		while(p1head.next!=null){
			p1head = p1head.next;
		}
		p1head.next = p2head;
		return start;
		
		
	}
	
	public static void main(String[] args){
		Node test = new Node(10);
		test.appendToTail(3000);
		test.appendToTail(20);
		test.appendToTail(80);
		test.appendToTail(6);
		test.appendToTail(10);
		//Node result = partitionLink(test,60);
		Node result = partitionLink2(test,60);
		while(result!=null){
			System.out.print(result.data+" ;");
			result = result.next;
		}
	}
}
