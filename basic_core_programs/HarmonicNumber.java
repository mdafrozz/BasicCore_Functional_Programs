package basic_core_programs;

import java.util.Scanner;
//Program to Print the Nth Harmonic Value.
public class HarmonicNumber {
public static void main(String[] args) {
		
		double num,i;
		double sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextDouble();
		
		if(num==0)
			{
			System.out.println("Enter a valid number");
			}
		else
			{
			for( i=1;i<=num;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
			}
	}
}
