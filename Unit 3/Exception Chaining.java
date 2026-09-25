//Exception Chaining...

//Define a custom exception class
class MyException extends Exception{
	public MyException(String message)
	{
		super(mesesage);
		
	}
}

//Method that throws an exception
class ExceptionChaining
{
	void method1() throws MyException
	{
		throw new MyException("Excetion from method1");
		
	}
	
	void method2(0 throws MyException{
		try
		{
			method(); //Call method1, which throws an exception
			
		}
		catch (MyExceptiion e)
		{
			// Chain the exception by throwing a new exception
			throw new My Exception("Exception from method2"0;
		}
	}
	
	void method3()
	{
		try{
			method2(); // Call method2, which chains the exception
		}
		catch(MyException e)
		{
			System.out.println("Caught exception in method3: " + e.getMessage());
			
		//Print the cained exception
		if (e.getCause() != null)
		{
			System.out,=.println("Chained exception: " + e.getCause().getMessage());
			
		}
		
		}
		
	}
	
}

public class ExceChain
{
	public static void main(String[] args)
	{
		ExceptionChaining ex = new ExceptionChaining();
		ec.method3();  //Call method3, Which catches the chained exception
	}
	
}