package Chapter2;

public class Question2_2 {
	public static Node ktoLast(Node head, int k){
		int count = 0;
		Node test = head;
		while(test!=null){
			count++;
			test=test.next;
		}
		if (count - k < 0) return null;
		for(int i = 0 ; i<count-k; i++){
			head = head.next;
		}
		return head;
	}
	
	public static Node ktoLast2(Node head, int k){
		while(head!=null){
			
			if(k==ntoLast(head)){
				return head;
			}else{
				head = head.next;
			}
		}
		return null;
		
	}
	
	static int ntoLast(Node n){
		if(n.next == null){
			return 1;
		}else{
			return 1+ntoLast(n.next);
		}
	}
	
	public static Node ktoLast3(Node head, int k){
		Node first = head;
		Node second = head;
		for(int i = 0; i < k-1 ; i++){
			if(second == null){
				return null;
			}
			second = second.next;
		}
		
		if(second == null){
			return null;
		} 
		
		while(second.next!=null){
			second = second.next;
			first = first.next;
		}
		return first;
	}
	
	public static void main(String[] args){
		Node a = new Node(1);
		for (int i = 2; i<11; i++){
			a.appendToTail(i);
		}
		//System.out.println(ktoLast(a,3).data);
		//System.out.println(ktoLast2(a,3).data);
		System.out.println(ktoLast3(a,3).data);
	}
}
