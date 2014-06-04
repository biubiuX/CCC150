package Chapter1;

// Write a method to replace all spaces in a string with '%20'. 
// You may assume that the string has sufficient space at the end of the string
// to hold the additional characters, and that you are given the "true" length 
// of the string. if implementing in java, please use a character array so that you
// can perform this operation in place.
public class Question1_4 {
	public static void replaceSpace(char[] charstr, int length){
		int count = 0;
		for (int i = 0; i < length; i++){
			if (charstr[i] == ' '){
				count++;
			}
		}
		int newLen = count*2 + length;
		charstr[newLen] = '\0';
		for (int i = length - 1, k = newLen; i >= 0; i--){
			if(charstr[i] == ' '){
				charstr[k-1] = '0';
				charstr[k-2] = '2';
				charstr[k-3] = '%';
				k = k-3;
			}else{
				charstr[k-1] = charstr[i];
				k--;
			}
			
		}
			
	}
	
	public static void main(String[] args){
		char[] charstr = "Hello this world       ".toCharArray();
		replaceSpace(charstr,16);
		System.out.println(charstr);
		
	}
}
