package Java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array {
	public void maximum() {
	int[] numbers = {10, 20, 30, 40, 50};
    // Find the largest number
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    System.out.println("The largest number in the array is: " + max);
}
	public void Largest_SmallestNumbers() {
	        int[] numbers = {45, 12, 78, 34, 89, 23, 5, 99};

	        int smallest = numbers[0];
	        int largest = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        System.out.println("Smallest number: " + smallest);
	        System.out.println("Largest number: " + largest);
	    }
	
	public void second_largestarray_sort() {
		int[] arr= {19,22,34,45,23,56,34,78};
		System.out.println("Second Largest number in array is : ");
		Arrays.sort(arr);
		System.out.println("second largest number is : "+arr[(arr.length)-2]);
		System.out.println("largest number is : "+arr[(arr.length)-1]);
		System.out.println("second smallest number is : "+arr[1]);
		System.out.println("smallest number is : "+arr[0]);
	}
	
	//find the second-highest number in an array
	public void second_LargestSmallestarray() {
	  int[] arr = {234,35,645,67,67,78,33};
	  System.out.println("Array = "+Arrays.toString(arr));
	  for(int i =0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]) {
				 int a=arr[i];
				 arr[i]=arr[j];
				 arr[j]=a;
			 }
		  }
	  }
	  System.out.println("largest number is : "+arr[(arr.length)-1]);
		System.out.println("second largest number is : "+arr[(arr.length)-2]);
		System.out.println("second smallest number is : "+arr[1]);
		System.out.println("smallest number is : "+arr[0]);
	    }
	
	
public void RemoveDuplicateElement_set() {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Jacon");
	list.add("maha");
	list.add("Jacon");
	list.add("gow");
	Set<String> map = new LinkedHashSet<>(list);
	System.out.println(map);
}

public void Duplicate_WordArryaList() {
	ArrayList<String> list = new ArrayList<String>();
	list.add("maha");
	list.add("Gow");
	list.add("Gow");
	list.add("maha");
	list.add("type");
	for(int i =0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
			if((list.get(i)).equals(list.get(j))) {
				System.out.println("Duplicate elements in the arraylist is: "+list.get(i));
				break;
			}
		}
	}
}


public void Duplicate_ArryaList() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(10);
	list.add(30);
	for(int i =0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
			if((list.get(i)).equals(list.get(j))) {
				System.out.println("Duplicate elements in the arraylist is: "+list.get(i));
				break;
			}
		}
	}
}

		public static void main(String[] args) {
			Array a= new Array();
			a.Duplicate_WordArryaList();
	    
	}
}
	



