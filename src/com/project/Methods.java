package com.project;

public class Methods {
	
	
	
	static int operation(int a,int b) {
		int c;
		if(a>b) {
			c=a+b;
			
		}
		else {
			c=(a*b)+5;
			
		}
		return c;
	}
	public static void main(String[] args) {
		int x=34;
		int y=30;
		int z=operation(x,y);
		
		System.out.println(z);  //method calling
		
		operation();
	} 
	
	static void operation() 
	{
		String w="hello";
		System.out.println("hello");   //method overloading
	}

}
