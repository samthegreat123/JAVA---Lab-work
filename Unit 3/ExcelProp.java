//Exception Propagation..

public class ExcelPropExample{
	public static void main(String[] args)
	{
		try
		{
			method1();
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception caught in main:" + e);
			
		}
	}
	public static void method1()
	{
		method2(); //method2 not handle exception..
	}
	
	public static void method2()
	{
		method3(); // method3 not handle exception..
		
	}
	
	public static void method3()
	{
		//Exception occurs here
		int result = 10/0; // ArithmeticException; / by Zero
	}
		