package com;

public class LongestWord {
	public static void main(String[] args) {
//	Input:
//		Java is an object oriented programming language
//
//		Output:
//		programming
		String longestString = "";
		String word="";
		String str = "Java is an object oriented programming languag";
      for(int i=0;i<str.length();i++) {
    	  if(str.charAt(i)!=' ') {
    		  word=word+str.charAt(i);
    	  }else {
    		  if(word.length()>longestString.length()) {
    			  longestString=word;
    		  }
    		  word="";
    	  }
      }
      for(int i=0;i<word.length();i++) {
    	  if(word.length()>longestString.length()) {
    		  longestString=word;
    	  }
      }
      System.out.println(longestString);
	

	}
}
