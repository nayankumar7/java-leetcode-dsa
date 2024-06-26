import java.util.*;
public class Solution {
    public static boolean isPalindrome(int s ){
        	String z = Integer.toString(s);
        	int p = z.length()/2;
		int q = z.length()%2;
		int r = p+q;
		int t = z.length()-1 ;
	for (int i = 0 ; i < r ; i++ ){
	  char u = z.charAt(i);
	  char v = z.charAt(t-i);
	  if (u == v){
	      
	  }
	  else{
	      return false ;	      
	  }
   }     
     return true ;   
    }
		public static void main(String[] args) {				Scanner sc = new Scanner(System.in);
		 int s =  sc.nextInt();
		  System.out.println(isPalindrome(s));	
	}
}