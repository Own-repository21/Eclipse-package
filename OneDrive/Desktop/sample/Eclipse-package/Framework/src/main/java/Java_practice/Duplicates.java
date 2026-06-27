package Java_practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Duplicates {

	//Find duplicate char from string
	public void Duplicate_char() {
		String str= "Mahalakshmi";
		char[] character= str.toCharArray();
		int length= character.length;
		System.out.println("The length of string is : " +length);
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if (character[i] == character[j]) {
					System.out.print(character[i] + " ");
					break;
				}
			}
		}
	}
	
	// print duplicate characters using map
public void dulicate_char_collection() {
	 String str = "programming";
     Map<Character, Integer> map = new LinkedHashMap<>();
     for (char ch : str.toCharArray()){
         if(map.containsKey(ch)){
             map.put(ch,   map.get(ch)+1);
         }
         else{
             map.put(ch,1);
         }
     }
     for(char ch : str.toCharArray()){
         if(map.get(ch)>1){
            System.out.println(ch);
            map.put(ch, 0);
         }
     }
   }

public void duplicate_count() {
	  String str = "programming";
	  Map<Character, Integer> map = new LinkedHashMap<>();
	  for(char ch : str.toCharArray()){
	      if(map.containsKey(ch)){
	          map.put(ch, map.get(ch)+1);
	      }
	      else{
	          map.put(ch,1);
	      }
	  }
	  for(Map.Entry<Character, Integer> entry : map.entrySet()){
	     
	      if(entry.getValue()>1){
	          System.out.println(entry.getKey() + " : " +entry.getValue());
	      }
	  }
}

// print duplicates string
	public void duplicate_strings() {
		String[] arr = {"list", "comma", "dot", "list", "comma"};
		
		for(int i = 0; i <arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
				}
	//print duplicates num using manual
	public void duplicate_num() {
		int[] arr = {10,28,57,69,38,28};
		
		for(int i = 0; i <arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
				}
	
	public void RemoveDuplicatesSet_Array() {
        Integer[] arr = {10, 20, 10, 30, 40, 20, 50, 30};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("Array after removing duplicates: " + set);
    }
	//print duplicates num using collections
	public void duplicate_num_map()
	{
		  String str = "cucumber";
	        Map<Character, Integer> map = new LinkedHashMap<>();
	            for(char ch : str.toCharArray()){
	                if(map.containsKey(ch)){
	                    map.put(ch, map.get(ch)+1);
	                }
	                else{
	                    map.put(ch,1);
	                }
	            }
	            for(char ch : str.toCharArray()){
	                if(map.get(ch)>1)
	                System.out.println(ch);
	            }
	            
	}
	
	
	// print non repeated character
	public void non_repeated() {
		 String str = "cucumber";
	       char[] ch = str.toCharArray();
	       for(int i = 0;i<str.length();i++){
	           boolean repeated = false;
	           for(int j = 0;j<str.length();j++){
	               if(i!=j && ch[i]==ch[j]){
	                   repeated = true;
	                   break;
	               }
	           }
	           if(!repeated){
	               System.out.println(ch[i]);
	           }
	           }
	       }
	
	// print first non repeated character
		public void non_repeated11() {
			 String str = "cucumber";
		       char[] ch = str.toCharArray();
		       for(int i = 0;i<str.length();i++){
		           boolean repeated = false;
		           for(int j = 0;j<str.length();j++){
		               if(i!=j && ch[i]==ch[j]){
		                   repeated = true;
		                   break;
		               }
		           }
		           if(!repeated){
		               System.out.println(ch[i]);
		               return;
		           }
		           }
		       }
		
		//print non-repeated characters using map 
		public void non_repeated1(){
		 String str = "programming";
	      Map<Character, Integer> map = new LinkedHashMap<>();
	      for (char ch : str.toCharArray()){
	          if(map.containsKey(ch)){
	              map.put(ch,   map.get(ch)+1);
	          }
	          else{
	              map.put(ch,1);
	          }
	      }
	      for(char ch : str.toCharArray()){
	          if(map.get(ch)==1){
	             System.out.println(ch);
	             map.put(ch, 0);
	             return;
	          }
	      }
	    }


	//remove duplicates from array string
	public void remove_strings() {
		 int[] arr = {1,2,3,1,2,2,4,6,5};
	       Map<Integer, Integer> map = new LinkedHashMap<>();
	       for(int num : arr){
	           if(map.containsKey(num)){
	               map.put(num, map.get(num) + 1);
	           }
	           else{
	               map.put(num,1);
	           }
	       }
	       for(int num :arr){
	           if(map.get(num) ==1){
	               System.out.println(map);
	               return;
	       
	           }
	       }
	}
	
	
	public static void main(String[] args) {
		Duplicates s= new Duplicates();
		//s.stringlength();
		s.duplicate_num_map();
		//s.Duplicate_char();
	}
}
