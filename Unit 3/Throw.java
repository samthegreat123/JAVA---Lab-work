//Throw keyword..
public class TestThrow{
	static void checkvotingEligibility(int age, String studentName){
		if(age < 18){
			//Explicitly throwing an unchecked ArithmeticException..
			
			throw new ArithmeticException(studentName +" is not eligible to vote ( Age must be 18 +").);
	}else{
		System.out.println(studentName + " is eligible to vote!");
	}
	
	}
	
	public static void main(String [] agrs)
	{
		try{
			System.out.println("Checking registration for Viaan...");
			checkvotingEligibility(16, "Viaan"); //Age 16 triggers throw..
			
		} catch (ArithmeticException e){
			System.out.println("Caught Explicit Exception:" + e.getMessgae());
			
		}
	}
	
}