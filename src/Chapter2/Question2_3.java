package Chapter2;

public class Question2_3 {
	public static boolean deleteMid(Node mid){
		if(mid == null || mid.next==null){
			return false;
		}
		mid.data = mid.next.data;
		mid.next = mid.next.next;
		return true;
	}
	
	public static void main(String[] args){
		Node a = new Node(1);
		Node mid;
		for (int i = 2; i<11; i++){
			a.appendToTail(i);
		}
		Node b = a;
		for (int i = 0; i<5;i++){
			b = b.next;
		}
		System.out.println(b.data);
		System.out.println(deleteMid(b));
		while(a!=null){
			System.out.print(a.data);
			a = a.next;
		}
		
	}
}
