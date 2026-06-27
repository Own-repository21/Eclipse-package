package Java.basics;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	int n=10;
	int a=1, b=1,c;
	public void series()
	{
		System.out.println("Fibonacci series :");
		System.out.println(a);
		System.out.println(b);
 		for (int i=3;i<n;i++)
		{
 			c=a+b;
 			System.out.println(c);		
		a=b;
		b=c;
		}
	}
	
	// Find missing number
	public void missing_number() {
		 int[] arr = {1,2,4,5};
	        int n = 5;
	        int sum =0;
	        for(int num :arr){
	            sum = sum+num;
	        }
	        int actual_count = n*(n+1)/2;
	        int expected_num = actual_count - sum;
	        System.out.println(expected_num);
	    }

	//find 2nd missing number
	public void SecondMissingNumber() {
	 
	        int[] arr = {1, 2, 5};
	        int n = 5;

	        // Step 1: Store elements in HashMap
	        Map<Integer, Boolean> map = new HashMap<>();
	        for (int num : arr) {
	            map.put(num, true);
	        }

	        // Step 2: Loop through 1 to n
	        int count = 0;
	        for (int i = 1; i <= n; i++) {
	            if (!map.containsKey(i)) {
	                count++;
	                if (count == 2) {
	                    System.out.println("2nd minimum missing number: " + i);
	                    break;
	                }
	            }
	        }
	            
	        }
	        
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci sample = new Fibonacci();
		sample.series();
	}
}
