public class StringReverse{
	public static void main(String [] args){
		String sentence = "Please reverse me!";
		System.out.println(reverseMe(sentence));
	}
	
	public static String reverseMe(String strIn){
		StringBuilder strB = new StringBuilder();
				
		for(int i = strIn.length() -1; i>=0; i--){
			strB.append(strIn.charAt(i));
		}
		
		return strB.toString();
	}
}