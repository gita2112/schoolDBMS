package test;

abstract class Arithmetic {

	int num1;
	int num2;
	int num3;
	
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}


abstract int calculation(int num1,int num2);

public void displayResult()
{
	System.out.println("First Number:\t"+num1+":"+"Second Number:\t"+num2+"=\t"+"Result:\t"+num3);
}
}


