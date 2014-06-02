package Chapter1;

// Given two strings, write a method to decide if one is a permutation of the other

public class Question1_3 {
	public static boolean isPermutation1(String str1, String str2){
		
		//Sort to string and compare them one by one
		
		if (str1.length()!=str2.length()){
			return false;
		}
		str1 = sortString(str1);
		str2 = sortString(str2);
		
		if(str1.equals(str2)){
			return true;
		}
		
		return false;
		
	}
	
	public static String sortString(String str){
		char[] charstr = str.toCharArray();
		java.util.Arrays.sort(charstr);
		return new String(charstr);
	}
	
	public static boolean isPermutation2(String str1, String str2){
		
		// count the number of each character
				
		if(str1.length()!=str2.length()){
			return false;
		}
		int[] checker = new int[256];
		for(int i = 0; i < str1.length(); i++ ){
			checker[(int)(str1.charAt(i))]++;
		}
		
		for (int i = 0; i<str2.length();i++){
			if(--checker[(int)str2.charAt(i)]<0){
				return false;
			}
			
		}
		return true;
		
		
	}
	
	public static void main(String[] args){
		String s1 = "Ehome Burning";
		String s2 = "Burning Ehome";
		System.out.println(isPermutation1(s1,s2));
		System.out.println(isPermutation2(s1,s2));
	}
}
