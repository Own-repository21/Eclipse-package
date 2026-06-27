package Java.basics;

public class Palindrome_amstrong_ {
	public void Palindromenumber() {
		int reverse = 0, rem;  
        int original = 123;  // Original number
        int num = original;  // Copy of original number for manipulation

        while (num > 0) {
            rem = num % 10;  // Extract last digit
            reverse = reverse * 10 + rem;  // Build reversed number
            num = num / 10;  // Remove last digit
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
	}
	
	public void string_palindrome() {
		   String str = "madam";
		     String reverse ="";
		     
		     for(int i= str.length()-1;i>=0;i--){
		         reverse = reverse + str.charAt(i);
		     }
		     if(str.equals(reverse)){
		         System.out.println("this is a palindrome");
		     }
		     else{
		         System.out.println("this is not a palindrome");
		     }
		    }
	
	public void reverse() {
		int n= 12343;
		int reversed =0;
		while(n>0) {
			int rem = n%10;
			reversed = reversed *10 +rem;
			n= n/10;
		}
		System.out.println(reversed);
	}
	
	public void amstrong(int n) {
		int t = n, s = 0, digit;
		while (n > 0) {
			digit = n % 10;
			s = s + (digit * digit * digit);
			n = n / 10;
		}
		if (s == t) {
			System.out.println(+t+" is an amstrong");
		} else {
			System.out.println(+t+" is not an amstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_amstrong_ sample = new Palindrome_amstrong_();
		sample.reverse();
	//	sample.reverse;
	}

}
