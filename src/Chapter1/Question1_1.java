package Chapter1;

// Implement an algorithm to determine if a string has all unique characters. 
// What if you cannot use additional data structures?

public class Question1_1 {
	public static boolean isUnique(String str){
		if(str == null){
			return false;
		}
		
		int checker = 0;
		for(int i=0; i<str.length();i++){
			int adj = str.charAt(i)-'a';
			int tell = 1<<(adj);
			if((checker & tell) >0){
				return false;
			}
			checker |=tell;
	
		}
		return true;
	}
	
	public static void main(String args[]){
		String test = "Cracking the Coding Interview";
		System.out.print(isUnique(test));
	}
	
}

