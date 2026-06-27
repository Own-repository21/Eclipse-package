package Java_practice;

import java.util.Arrays;

public class Numbers_sort {
	public void sorting_numbers() {
		int[] arr = {12,23,45,67,23,45,78};
		Arrays.sort(arr);
		
		System.out.println("Smallest number is: "+arr[0]);
		System.out.println("2nd Smallest number is: "+arr[1]);
		System.out.println("Largest number is: "+arr[arr.length-1]);
		System.out.println("2nd Largest number is: "+arr[arr.length-2]);
	}
	
	public void largest_withoutsorting() {
		int[] arr = {12,23,45,67,23,34,15};
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		System.out.println("Smallest number is: "+arr[0]);
		System.out.println("2nd Smallest number is: "+arr[1]);
		System.out.println("Largest number is: "+arr[arr.length-1]);
		System.out.println("2nd Largest number is: "+arr[arr.length-2]);
	}

	//descending order
	public void occurrence() {
		int a[] = {2,5,2,5,7,8,4};
		for(int i = 0; i<a.length-1;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j] = temp;
					}
			}
		}
		for(int num : a) {
			System.out.println(num);
		}
		}
	
	public void largest_words() {
		String str = "programming is easy to learn";
		 String[] words = str.split(" ");
		 String largestwords= words[0];
		 for(int i=1;i<words.length;i++){
		     if(words[i].length()>largestwords.length()){
		         largestwords = words[i];
		     }
		 }
		 System.out.println("Largest word in the sentence: " + largestwords);
	        System.out.println("Length of largest word: " + largestwords.length());
	    }
	
	public static void main(String[] args) {
		Numbers_sort Numbers_sort = new Numbers_sort();
		Numbers_sort.largest_withoutsorting();
		// TODO Auto-generated method stub

	}

}
