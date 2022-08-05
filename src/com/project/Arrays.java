package com.project;

public class Arrays {

	public static void main(String[] args) {
		String[] cars = {"Skoda","Swift","Suzuki"};
		String[] bikes = {"KTM", "RE"};
		
		System.out.println(cars);
		//System.out.println(bikes[0]);
		
		for(int i=0;i<=2;i++) {
		System.out.println(cars[i]);	

	}

	lie();

		for(String i:cars) {
		System.out.println(i);
		
	}
		
}
	public static void lie(int f){
		System.out.println("how r u"+f++);
		lie(7);
	}
	public static void lie(){
		System.out.println("how r u");
		lie(); 
	}
	 {
		
	}
}