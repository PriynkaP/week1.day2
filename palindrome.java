package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// * a) Declare A String value as"madam"
		String value = "madam";
		
		 //* b) Declare another String rev value as ""
		String rev = "";
		
		//* c) Iterate over the String in reverse order
		
		for (int i=value.length()-1;i>=0;i--) {
				
				
				//* d) Add the char into rev
			
		rev= rev+value .charAt(i);
		{
		
		
// * e) Compare the original String with the reversed String, if it is same then print palinDrome  
	 	  
		 if (rev == value)
			 {
			 
			 System.out.println(value+": palindrome");
		 }
		 else
		
			 System.out.println(rev+": is not palindrome");
		 }
		


	}

}
}
