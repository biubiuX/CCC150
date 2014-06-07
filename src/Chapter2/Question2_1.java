package Chapter2;

import java.util.Hashtable;

public class Question2_1 {
	public static void removeDup(Node head){
		Hashtable<Integer,Boolean> hashtable = new Hashtable<Integer,Boolean>();
		Node pre = null;
		while(head!=null){
			if(hashtable.containsKey(head.data)){
				pre.next = head.next;
			}else{
				hashtable.put(head.data, true);
				pre = head;
			}
			head = head.next;
		}
		
	}
	
	//???
	public static void removeDupNoBuffer(Node head){
		Node current = head;
		Node pre = current;
		while(current.next!=null){
			Node runner = current.next;
			while(runner!=null){
				if(current.data == runner.data){
					pre.next = runner.next;
				}else{
					pre = runner;
				}
				runner = runner.next;
			}
			current = current.next;
			pre = current;
		}
	}
	
	public static void main(String[] args){
		Node a = new Node(1);
		int[] array = {1,2,3,1,2,6};
		for (int i = 0; i<array.length;i++){
			a.appendToTail(array[i]);
		}
		//Node b = a;
		removeDupNoBuffer(a);
		while(a != null){
			System.out.print(a.data);
			a = a.next;
		}
		//removeDupNoBuffer(b);
		//while(b != null){
		//	System.out.print(b.data);
		//	b = b.next;
		//}
		
		
		
	}
}
