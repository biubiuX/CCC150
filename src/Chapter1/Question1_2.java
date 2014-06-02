package Chapter1;

// Implement a functino void reserve(char* str) in C which reverses a null-terminated string
public class Question1_2 {
	public static String javaReverse(String str){
		if (str==null){
			return str;
		}
		char[] newstr = str.toCharArray();
		for(int i=0;i<str.length()/2;i++){
			char tmp = newstr[i];
			newstr[i]=newstr[str.length()-1-i];
			newstr[str.length()-1-i]=tmp;
		}
		return new String(newstr);
		
	}
	
	public static void main(String args[]){
		String str = "Please reverse this string";
		System.out.println(javaReverse(str));
		
	}
}
