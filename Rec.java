package sumDigits;
import java.util.Scanner;
public class Rec {
	
	
	
	

  
 

    /** = sum of the digits in the decimal representation of n.
      e.g. sumDigits(0) = 0, sumDigits(3) = 3, sumDigits(34) = 7,
      sumDigits(345) = 12.
      Precondition: n >= 0. */
    public static int sumDigits(int n) {
	
	
	if(n==0) return 0;
	return n%10 + sumDigits(n/10);
	//int sum = 0;
	//for(int i=0 ; i<=n ; i++);
	//sum +=n;
	//return sum;
	
	
    }
	
    public static void main(String[] args) {
  
        System.out.println("-----------------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(123456));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
		
    }
}

