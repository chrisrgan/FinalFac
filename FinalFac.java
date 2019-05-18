import java.util.Scanner;
import java.math.BigInteger;




public class FinalFac
{
	
	public static String factorial(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	}
	
	

	public static void main(String[] args){
		System.out.println("Enter the number that you wish to see the sum of its factorial");
        Scanner scan = new Scanner(System.in);        
        
        int choice = scan.nextInt();
        String fact = factorial(choice);
        
        
        //This code block goes through each element/char in the string and turns it into an int. Then sums each of them up.
        int sum =0;
        for(int i = 0; i < fact.length(); i++) {
            int digit = (int) (fact.charAt(i) - '0');
            sum = sum + digit;
        }
        
        System.out.println("Factorial is " + fact);
        System.out.println("Sum is " + sum);
        
        
 	}
}




//Used this initially but soon realized overflow. 


//public static void Factorial(int n)
//{
//	long fac=1;
//	long sum = 0; 
//	
//	for(int i=1; i<=n; i++){
//		fac = fac*i;
//	}
//	
//	System.out.println("This is the factorial");
//	System.out.println(fac);
//	
//  		          
//	while (fac != 0) { 
//        sum = sum + fac % 10; 
//        fac = fac/10; 
//    } 
//	System.out.println("This is the Sum of its digits");  
//	System.out.println(sum);
//
//	
//	
//}