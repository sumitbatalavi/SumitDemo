package com.project;

public class Camp {

public static void main(String[] args) {
	int a=30;                           //if statement
	int b=30;
	if(a<b)
	{
		System.out.println("nijam ra babu");
	}
	else if(a > b) {
		System.out.println("emo cheppalem");
	}
	
	else {
		System.out.println("abadam ra babu");  // else statement
		
		 
	}

	String g=(a>b)?"true":"false";
	System.out.println(g);
	
	
	int name=3;
	switch (name) {
	  case 1:
	    System.out.println("mercedes benz");
	    break;
	  case 2:
	    System.out.println("audi");
	    break;
	  case 3:
	    System.out.println("volvo");
	    
	  case 4:
	    System.out.println("range rover");  // switch statement 
	    
	  case 5:
	    System.out.println("buggati");
	    break;
}

	int i=3;
	while(i<=20) {            //while loop
	System.out.println(i);
	i++;
			}
	while(i>=10) {
		System.out.println(i);
		i--;
	}
	
	for (int x = 0; x < 10; x+=2)  //x=x+2
		{
		  System.out.println(x);
		}
	for(int y=10; y<20; y++)
	{
		System.out.println(y);
	
	}
	
}
}