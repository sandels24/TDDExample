package main;

/**
 * 
 * @author SANDELS
 *
 */
public class StringReverse {

	public static void main(String[] args) {

		StringReverse strrev =  new StringReverse();
		System.out.println(strrev.reverse("hello"));
	}
	
	/**
	 * 
	 * @param str
	 * @return 
	 */
	public String reverse(String str) {
		if(str == null)
			return null;
		if(str.length()==0 || str.length()==1)
			return str;
		
		StringBuilder rev =  new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
}
