package com.Question_5;

public class Main {

	
	public static void main(String[] args) {
		
		String s="Hello Everybody, welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!";
		
		String str=s.toLowerCase();
		str=str.replaceAll("[!;:?,.]","");
		
		
		int count = 0;
		
		String[] words=str.split(" ");
		System.out.println("The words are ");
		for(int i=0;i<words.length;i++) {
			
			for(int j=0;j<words.length;j++) {
				String t1=words[i];
				String t2=words[j];
				
				if(j<i && t1.equals(t2)) {
					break;
				}
				
				if(j==words.length-1) {
					count++;
					
					System.out.println(count+". "+words[i]);
					
				}
				
			}
			
		}
		System.out.println("Number of words " + words.length+" Number of unique words " +count);
		
	}

}


