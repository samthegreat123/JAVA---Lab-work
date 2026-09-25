//  A java program that create a thread using Thread Class.. 

import java.lang.*;
class a extends Thread
{
	public void run()
	{
		for(int i =1; i<=5; i++)
		{
			System.out.println("From Thread A : i = " +i);
			
		}
		   System.out.println("Exit from Thread A");
		   
	}
	
}

class b extends Thread{
	public void run()
	{
		for(int j=1; j<=5; j++)
		{
			System.out.println("From Thread B: j =" +j);
		}
		   System.out.println("Exit from Thread B");
		   
	}
	
}

class c extends Thread{
	public void run()
	{
		for(int k=1; k<=5; k++)
		{
			System.out.println("From Thread c: k =" +k);
		}
		   System.out.println("Exit from Thread c");
		   
	}
	
}

class ex16;
{
	public static void main(String arg[])
	{
		a al = new a();
		al.start();
		b bl = new b();
		b1.start();
		c cl = new c();
		c.start();
		
	}
}



