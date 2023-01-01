package com.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.model.Course;
import com.model.Student;

@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("appname.properties")
public class AppConfig {
	
	@Bean
	 public List<Student> getList(){
		
		
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Keshav","Pune","keshav@gmail.com",100));
        list.add(new Student(2,"Krishna","Mumbai","krishna@gmail.com",50));
        list.add(new Student(3,"Satyam","Nagpur","satyam@gmail.com",70));
        list.add(new Student(4,"Rahul","Bandra","rahul@gmail.com",90));
        list.add(new Student(5,"Anand","Ranchi","anand@gmail.com",80));
        return list;
    }
	
	
	@Bean
	 public Map <Student,Course> getMap(){
        Map<Student, Course> map = new HashMap<>();
        
        map.put(new Student(1,"Keshav","Pune","keshav@gmail.com",100),new Course(1,"JAVA","3 month",5000));
        map.put(new Student(2,"Krishna","Mumbai","krishna@gmail.com",50),new Course(2,"Spring","3 month",7000));
        map.put(new Student(3,"Satyam","Nagpur","satyam@gmail.com",70),new Course(3,"Hibernate","6 month",7000));
        return map;
    }
	

}
