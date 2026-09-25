// Multi catch block exception...
Public class TestMultipleCatch{
	public static void main(String[]args)
	{
		int[] vivianScores = new int[3];
		vivanScores[0] = 95;
		vivanScores[1] = 90;
		vivanScores[2] = 85;
		
		vivanScores[5] = 100;//Throws  ArrayIndexOutofBoundsException
	}catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Error Occured");
	}catch ( ArrayIndexOutOfBoundsException e )
	{
		System.out.println(" Array Index Error: Vivaan accessed an invalid index:");
} catch(Exception e)
{
	 System.out.println("General Exception Handler:" + e);
}
}
}
