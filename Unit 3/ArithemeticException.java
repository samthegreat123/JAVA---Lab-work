// ArithmeticException Exception handling...
public class TestTrycatch{
	public static void main(String[]args){
		String studentName = "Vivian";
		System.out.println(studentName + "started math calculation..");
		
		try{
			int totalMarks = 100;
			int subjects = 0; //Risky divide by Zero;
			int result = totalMarks / subjects;//Throw ArithmeticException
			
			System.out.println("Result :" + result); //Skipped when exception occurs..
			
        }catch(ArithmeticException e){
			Syste.out.println("Exception Caught: Division by zero is not allowed for"+ studentName + "!");
			  System.out.println("System Error Detail :" + e.getMessage());
		}
		
		System.out.println(studentName + "s.program continues execution smoothly");
	}
	
}