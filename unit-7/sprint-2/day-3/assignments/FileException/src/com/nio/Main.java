package com.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		Path p=Paths.get("cde.txt");
		if(!Files.exists(p)) {
		Path p1=Files.createFile(p);};
		
		//System.out.println(p1+" "+p);
		String str="hello";
		
		Files.write(p, str.getBytes());
		Files.write(p, "\n".getBytes(), StandardOpenOption.APPEND);
		
		List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");
		//writing a List of String
		Files.write(p, list,StandardOpenOption.APPEND);
		//Files.next
		
		
   List<String> strings=Files.readAllLines(p);
   //strings.forEach(s->System.out.println(s));
   System.out.println(strings);
	}

}
