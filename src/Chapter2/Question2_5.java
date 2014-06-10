package Chapter2;

public class Question2_5 {
	public static Node LinkAdd(Node n1, Node n2){
		if(n1 == null && n2 == null){
			return null;
		}
		Node res = null;
		Node start = null;
		int extra = 0;
		while(n1!=null||n2!=null){
			int x = 0, y = 0;
			if(n1!=null){
				x = n1.data;
				n1 = n1.next;
			}
			if(n2!=null){
				y = n2.data;
				n2 = n2.next;
			}
			
			int sum = 0;
			sum = x + y + extra;
			extra = sum/10;
			sum = sum % 10;
			if(start == null){
				res = new Node(sum);
				start = res;
			}else{
			res.next = new Node(sum);
			res = res.next;
			}
		}
		if(extra != 0){
			res.next = new Node(extra);
		}
		return start;
		
	}
	
	public static Node LinkAdd2(Node n1, Node n2, int carry){
		if(n1==null&&n2==null&carry==0){
			return null;
		}
		int value = 0;
		if(n1!=null){
			value+=n1.data;
		}
		if(n2!=null){
			value+=n2.data;
		}
		value+=carry;
		carry = value/10;
		value = value%10;
		Node res = new Node(value);
		res.next = LinkAdd2(n1==null?null:n1.next, n2==null? null: n2.next, carry );
		return res;
	}
	public static void main(String[] args){
		Node p1 = new Node(0);
		p1.appendToTail(4);
		//p1.appendToTail(2);
		//p1.appendToTail(7);
		Node p2 = new Node(9);
		p2.appendToTail(9);
		p2.appendToTail(9);
		p2.appendToTail(9);
		//Node res = LinkAdd(p1,p2);
		Node res = LinkAdd2(p1,p2,0);
		while(res !=null){
			System.out.print(res.data);
			res = res.next;
		}
	}
}
