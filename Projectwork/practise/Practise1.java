package practise;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=in.nextInt();
	
	System.out.println("Enter second number");
	int num2=in.nextInt();

	System.out.println("Sum:" + num1+num2);
	System.out.println("product:" + num1*num2);
	System.out.println("subtract:" + (num1-num2));
	System.out.println("divide:" + num1/num2);
	System.out.println("remainder:" + num1%num2);
	
	
	}

}



