package practise;

import java.util.Scanner;

 class Practise2 {

	int x;
	int y;
	
	public static void main(String[] args) {
		Practise2 test=new Practise2();
		System.out.println(test.x);
		System.out.println(test.y);
		
		int i;
		int b;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sn.nextInt();
		System.out.println(a);
		for (i=1;i<=10;i++) {
			
			System.out.println(a+" *"+ (i) +" ="+ (a*(i)));
			
			
			
		}
		
	}

}
