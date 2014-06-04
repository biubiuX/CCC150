package Chapter1;

// Implement a method to perform basic string compression using the counts of 
// repeated characters. For example, the string aabcccccaaa would become
// a2b1c5a3. If the "compressed" string would not become smaller than the original
// string, your method should return the original string.


public class Question1_5 {
	public static String compressStr(String str){
		int count = 1;
		int size = 0;
		for (int i = 0; i< str.length()-1; i++){
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
			}else{
				size +=1+String.valueOf(count).length();
				count = 1;
			}
			if(i+1 == str.length()-1){
			size +=1+String.valueOf(count).length();
			}
		}
		if(size>str.length()){
			return str;
		}
		StringBuilder newstr = new StringBuilder();
		newstr.append(str.charAt(0));
		//char[] newstr = new char[count*2];
		//newstr[0] = str.charAt(0);
		int charcount = 1;
		//int newpoint = 1;
		for (int i = 0; i<str.length()-1; i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				newstr.append(charcount);
				newstr.append(str.charAt(i+1));
				charcount =1;
				
			}else{
				charcount++;
			}
			
			if(i+1==str.length()-1){
				newstr.append(charcount);
			}
			
		}
		return newstr.toString();
		
	}
	
	public static void main(String[] args){
		String str = "aaacccddddddefg";
		System.out.println(compressStr(str));
		System.out.println(String.valueOf(11).length());
	}
}
