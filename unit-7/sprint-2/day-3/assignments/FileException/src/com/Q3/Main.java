package com.Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
public static void main(String[] args) throws Exception, IOException {
	
  Path sourse_path =Paths.get("Files");
  Files.createDirectory(sourse_path);
  
  Path path = Paths.get("Files//newFile.txt");
  Files.createFile(path);
  String name = "Nitin";
  Files.write(path,name.getBytes(),StandardOpenOption.APPEND);
  Files.write(path,"\n".getBytes(),StandardOpenOption.APPEND);
  List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");

   Files.write(path,list,StandardOpenOption.APPEND);
   
   List<String> read = Files.readAllLines(path);
   read.forEach(e->System.out.println(e));
	
}
}
