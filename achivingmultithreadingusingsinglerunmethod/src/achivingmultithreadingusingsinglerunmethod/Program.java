package achivingmultithreadingusingsinglerunmethod;

import java.util.Scanner;

public class Program extends Thread{
public void run()
{
	try
	{
		if(getName().equals("BANK"))
		{
			banking();
		}
		else if(getName().equals("ADD"))
		{
			add();
		}
		else
		{
			printing();
		}
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void banking()
{
	try
	{
		System.out.println("Banking started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the acc no");
		int ac = scan.nextInt();
		System.out.println("Enter the password");
		int pw = scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect your money");
		System.out.println("Banking has ended");	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void add()
{
	try
	{
		System.out.println("Addition has started");
		int a=10,b=20;
		int c = a+b;
		Thread.sleep(5000);
		System.out.println(c);
		System.out.println("Addition ended");
		
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void printing()
{
	try
	{
		System.out.println("Printing started");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
			
		}
		System.out.println("Printing ended");

}

catch(Exception e)
{
	e.printStackTrace();
}
}
}