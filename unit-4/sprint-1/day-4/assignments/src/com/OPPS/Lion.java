package com.OPPS;

public class Lion {
	
	static String name;
	static boolean isHungry;
	static int age;
	static int totalDeaths=0;
	
public static void  printKillings(){
	System.out.println("Total killings by lions in jungle = "+ totalDeaths);
}

public static void  thinking(){
	 if (isHungry==false)
	    System.out.println(name+" is sleeping");
	 
	 if (isHungry==true && age>12 ) {
		totalDeaths+=2;
		System.out.println(name+" has eaten two animal");
	 }

	 if (isHungry==true && age<=12 && age >=2) {
		 totalDeaths+=1;
		 System.out.println(name+" has eaten one animal");
	 }

	 if (isHungry==true && age<2)
         System.out.println(name+" is calling Mom");
}
	
public static void main (String[] args) {
	Lion obj1=new Lion();
	obj1.name="Gabber";
	
	obj1.isHungry=false;
	
	obj1.age=23;
	
	thinking();
	
	
	
	Lion obj2=new Lion();
	
    obj2.name="Sheru";
	
	obj2.isHungry=true;
	
	obj2.age=10;
	
	thinking();
	
	
	
	Lion obj3=new Lion();
	
    obj3.name="Simbha";
	
	obj3.isHungry=true;
	
	obj3.age=1;
	
	thinking();
	
	printKillings();
}
}
