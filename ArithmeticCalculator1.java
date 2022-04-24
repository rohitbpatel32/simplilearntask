package com.project1;

import java.util.Scanner;

public class ArithmeticCalculator1 {
	public static void main(String []args) {
		
		float n1;
		float n2;
		 float addition,division,subtraction;
		 int product;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1 and n2");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		int j;
		do {
		System.out.println("Enter 1 for addition, enter 2 for multiplication, enter 3 for divison and enter 4 substraction");
		int ch=sc.nextInt();
		switch(ch) {
		
		case 1 :  addition = (n1+n2);
		System.out.println(+addition);
					break;
		case 2 :  product = (int) (n1*n2);
		System.out.println(product);
					break;
		case 3 : { 
			if(n1>n2) {
				division = (n1/n2);
			}
			else {
				division = (n2/n1);
			}
		System.out.println(division);
				break;
		}
		
		case 4: subtraction =(n1-n2);
		System.out.println(subtraction);
			break;
		}
		System.out.println("Press 0 to continue");
		j = sc.nextInt();
		}
		
		while(j==0);System.out.println("SUccessful exit");
	}
}
