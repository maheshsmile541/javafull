
import java.util.*;

import java.text.*;
import java.util.*;
import java.util.Map.Entry;
 
public class asdfasd {
public static void main(String[] args) {
	
//	int original=9474;
//	int n=original;
//	int count=0;
//	
//	
//	while(n>0) {
//		n=n/10;//947/
//		 count++;
//	}
//	int sum=0;
//	int duplicate=original;
//	int lastdigit=0;
//	while(duplicate!=0) {
//		lastdigit=duplicate%10;//4,7
//		
//		int multiplyLastdigit =1;//4,16,64,256
//		
//		for(int i=1;i<=count;i++) {
//			multiplyLastdigit=multiplyLastdigit*lastdigit;
//		}
//		
//		duplicate=duplicate/10;
//		sum=sum+multiplyLastdigit;
//		
//	}
//	System.out.println("output "+ sum);
//	if (original==sum) {
//		System.out.println(original+" amstrong number "+sum);
//	}
//	else {
//		System.out.println(original+" not amstrong number "+sum);
//	}

//
//
//String n="java2blog";
//String reverse="";
//
//for(int i=n.length()-1;i>=0;i--) {
//	reverse=reverse+n.charAt(i);
//	System.out.println(reverse);
//
//}
//System.out.println(reverse);
//



 
// 
//  System.out.println("java2blog has all unique chars : "+ hasAllUniqueChars("java2blog"));
//  System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
//  System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
//  System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));
//}
// 
//public static boolean hasAllUniqueChars (String word) {
// 
//     HashSet alphaSet=new HashSet();
// 
//     for(int index=0;index < word.length(); index ++)   {
// 
//         char c =word.charAt(index);
// 
//         // If Hashset's add method return false,that means it is already present in HashSet
//         if(!alphaSet.add(c))
//              return false;
//     }
// 
//     return true;
//     
//     
     
	
//	
//    String word = "javadd1blog";
//    String anagram = "aj1vabgol";
//    int count=1;
//    char a[]=word.toCharArray();
//    char b[]=anagram.toCharArray();
//    Arrays.sort(a);
//    Arrays.sort(b);
//    if(word.length()!=anagram.length()) {
//    System.out.println("false");
//    }
//  else if(word.length()==anagram.length()) {
//   for(int i=0;i<a.length;i++) {
//	 
//	   if(a[i]!=b[i]) {
//		 count++;
//			   }	  
//}
//  if(count>1) {
//	  System.out.println("false");
//  }
//  else {
//	  System.out.println("true");
//  }
//  
	  
//}
     
//
//	  System.out
//	    .println("First non repeated character for String analogy is : "
//	      + getNonRepeatedCharacter("analogy"));
//	  System.out
//	    .println("First non repeated character for String easiest is : "
//	      + getNonRepeatedCharacter("easiest"));
//	}
//	 
//	public static Character getNonRepeatedCharacter(String str) {
//	  Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
//	  for (int i = 0; i < str.length() - 1; i++) {
//	   Character c = str.charAt(i);
//	   if (!countCharacters.containsKey(c)) {
//	    countCharacters.put(c, 1);
//	   } else {
//	    countCharacters.put(c, countCharacters.get(c) + 1);
//	   }
//	  }
//	  // As LinkedHashMap maintains insertion order, first character with
//	  // count 1 should return first non repeated character
//	  for (Entry<Character, Integer> e : countCharacters.entrySet()) {
//	   if (e.getValue() == 1)
//	    return e.getKey();
//	 
//	  }
//	  return null;
//	
//	}}
//	  
//	  
	  
	  
	  
	  
	  
	  
	  
	String s1="nagaraju";
	String s21="easiest";
	int count=0;
for (int i=0; i<s1.length();i++) {
	for(int j=i+1;j<s1.length();j++) {
		
		if(s1.charAt(i)!=s1.charAt(j)) {
			
			count++;
		}
		if(count==0) {
			System.out.println(s1.charAt(j));
			break;
		}
		
	}
		
	}













}}


//
//

	
	

     
     
     









