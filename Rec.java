package sumDigits;
import java.util.Scanner;
public class Rec {
	
<<<<<<< HEAD
		
			if (n < 10 && n>-10){
			    		
					    		return 1;
							        
								        }  else {
									        	
											          return 1 + numDigits(n/10);
												          }
													  	
														    }
    }
=======
	
	
	

  
 
>>>>>>> sumDigits

    /** = sum of the digits in the decimal representation of n.
      e.g. sumDigits(0) = 0, sumDigits(3) = 3, sumDigits(34) = 7,
      sumDigits(345) = 12.
      Precondition: n >= 0. */
    public static int sumDigits(int n) {
	
	int a = 0;
	if(n==0) return 0;
	return n%10 + sumDigits(n/10);
	//int sum = 0;
	//for(int i=0 ; i<=n ; i++);
	//sum +=n;
	//return sum;
	
	
	
<<<<<<< HEAD
    /** = a copy of s with to_remove_char removed.
		Example: removeChar("abeabe", 'e') = "abab". */
	public static String removeChar(String s, char to_remove_char) {
		if(s.length() == 0) return"";
		if(s.charAt(0)) == to_remove_char) return removeChar(s.substring(i)), to_remove_char);
		else return String.valueOf(s.charAt(0))+ removeChar(s.substring(i)),to_remove_char);
     
	}
	
    /** = a copy of s with characters in reverse order.
		Example: reverse("abcdefg") = "gfedcba". */
	public static String reverse(String s) {
	

 if(s.length()==0)return"";
 		return reverse(s.substring(1))+String.valueOf(s.charAt(0));
				// fill me in
						
  
  
}
  public static void main (String[] args) {
        System.out.println(numDigits(123));
        System.out.println(numDigits(123456));
        System.out.println(numDigits(1));
        System.out.println(numDigits(0));
=======
	
    }
	
    public static void main(String[] args) {
  
>>>>>>> sumDigits
        System.out.println("-----------------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
		
    }
}

