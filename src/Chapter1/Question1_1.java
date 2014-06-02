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
	
	public static boolean isUnique2(String str){
		if (str.length()>256){
			return false;
		}
		
		boolean[] charset = new boolean[256];
		for (int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(charset[val]){
				return false;
			}
			charset[val]=true;
		}
		return true;
	}
	public static void main(String args[]){
		String test = "Cracking the Coding Interview";
		System.out.println(isUnique(test));
		System.out.println(isUnique2(test));
	}
	
}

