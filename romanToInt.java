import java.util.*;
class Solution {
    public static int romanToInt( char j) {
        
        
        if(j == 'I'){
             
            return 1 ;
           
        }
        else if(j =='V' ){
            return 5 ;
        }else if (j == 'X'){
            return 10 ;
        }else if (j =='L'){
            return 50 ;
        }else if (j == 'C'){
            return 100;
        }else if (j == 'D'){
            return 500;
        }else if (j=='M'){
           return 1000; 
        }
    
        
        return 0;
    }
  	public static void main(String[] args) {
  	    Scanner sc = new Scanner(System.in);
  	    String s = sc.next();
  	    int sum = 0 ;
  	    int arr [] = new int [s.length()];
          
  	     for (int i = 0 ; i < s.length(); i++){
           
       char j = s.charAt(i) ; 
       
   
           arr [i] = romanToInt(j) ;
           
              sum += arr [i];
  	   	
  	     }
  	     for (int k =0 ; k < s.length()-1; k++){
  	         if (arr[k]<arr[k+1]){
  	             sum -= 2*arr[k];
  	         }
}	System.out.println(sum);
  	     
  	}
}