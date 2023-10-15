package com.assignment;

import java.util.Scanner;


public class PangramCheck { 

   public static boolean isPangram(String str) {
	   boolean[] alphabetPresent = new boolean[26];
	   str = str.toLowerCase();
	   
	   for(int i=0;i<str.length(); i++) {
		   char ch = str.charAt(i);
		   if(ch >= 'a' && ch <= 'z') {
			   alphabetPresent[ch - 'a'] = true;
		   }
	   }
	   for(boolean alphabet : alphabetPresent) {
		   if(! alphabet) {
			   return false;
		   }
	   }
	   return true;
   }
   
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String input = sc.nextLine();
	sc.close();
	
	boolean isPangram = isPangram(input);
	
	if(isPangram) {
		System.out.println("The string is Pangram");
	}
	else {
		System.out.println("Not Pangram");
	}
  }
}

