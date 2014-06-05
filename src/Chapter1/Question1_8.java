package Chapter1;

public class Question1_8 {
	public static boolean isSubString(String first, String second){
		if(first.length()>second.length()){
			return false;
		}
		if (second.indexOf(second)>=0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean isRotation(String s1, String s2){
		if((s2.length()==s1.length() )&& (s1.length() > 0)){
			String s1s2 = s1+ s2;
			return isSubString(s1,s1s2);
		}
		
		return false;
		
	}
	
	public static void main(String[] args){
		String s1 = "DalianUniversity";
		String s2 = "UniversityDalian";
		System.out.println(isRotation(s1,s2));
		
	}
}
