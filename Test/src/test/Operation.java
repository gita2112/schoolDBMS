package test;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		int num1;
		int num2;
		Arithmetic[] obj=new Arithmetic[4];
		obj[0]=new Add();
		obj[1]=new Sub();
		obj[2]=new Div();
		obj[3]=new Mul();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		num1=sc.nextInt();
	    System.out.println("Enter Second Number:");
	    num2=sc.nextInt();
	    System.out.println("Enter any choice to perform Arithmatic operation:\n1)Addition \n2)Subtraction \n3)Division \n4)Multiplication");
	    int choice=sc.nextInt();
	    
	    if(choice>4)
	    {
	    	System.out.println("Invalid o/p");
	    }
	    else
	    {
	    	Arithmetic obj1=obj[choice-1];
	    	obj1.setData(num1, num2);
	    	obj1.calculation(num1, num2);
	    	obj1.displayResult();
	    }
	}


}
