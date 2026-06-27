package Java_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class practice {
	
	
	public void reverse() {
		String str = "cucumber";
	char[] ch = str.toCharArray();
	for(int i =0;i<str.length();i++) {
		for(int j = 0;j<str.length();j++) {
			if(ch[i] == ch[j]) {
				System.out.println(ch[i]);
				return;
			}
		}
	}
	}
	public void c(){
		String str = "cucumber";
		char[] ch = str.toCharArray();
		for(int i =0; i<str.length();i++) {
			boolean repeated =false;
		
		for(int j=0;j<str.length();j++) {
			if(i!=j && ch[i] ==ch[j]) {
				repeated = true;
				break;
				
			}
		}
		if(!repeated) {
			System.out.println(ch[i]);
			return;
		}
		}
	}
	
public static void main(String[] args) {
	practice practice= new practice();
	
	//practice.non_repeated();
}
}

