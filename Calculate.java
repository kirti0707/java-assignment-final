package assignment;

import java.util.Scanner;

public class Calculate 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int a,b,selection;
		System.out.println("Enter the first input");
		a=scn.nextInt();
		System.out.println("Enter the second input");
		 b= scn.nextInt();
		System.out.print("what operation do you want to perform ");
       
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.Division");
		selection=scn.nextInt();
		Calculate calc= new Calculate();
		calc.Operations(a,b,selection);
	}
	
	public void Operations(int a,int b,int selection)
	{
		switch(selection)
		{
		case 1:
		{
		int add= a+b;
		System.out.println("addition ="+add);break;
		}
		case 2:
		{
			int sub= a-b;
		System.out.println("substraction ="+sub);break;
		}
		case 3:
		{
			int mul= a*b;
		System.out.println("multiplication ="+mul);break;
		}
		case 4:
		{
			int div=a/b;
		System.out.println("division = "+div);break;
		}
		default:System.out.println("please enter the correct input");
	   }
		
	}
}


