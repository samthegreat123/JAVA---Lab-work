//Implementing custom exception..


//step 1: Create Custom Exception Class
class InvalidStudentMarksException extends Exception{
	//constructor passing message to parent Exception class
	public InvalidStudentMarksException(String message)
	{
		super(message);
	}
}

 //Step 2: Use Custom Exception in BUsiness Logic
 public class TestCustomException{
	 static void validteViaanMarks(double marks) throws InvalidStudentMarksException{
		 if(marks <0.0 || marks > 100.0)
		 {
			 throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was:" + marks);
		 }else{
			 System.out.println("Vivaan's Marks Validate Succesfully: " + marks);
		 }
	 }
	 
	 
	 
	 public static void main(String[] args)
	 {
		 try{
			 System.out.println("Submitting Exam Score for Vivaan..");
			 validateVivaanMarks(105.5);//Triggers Custom Exception
		 }catch ( InvalidStudentMarksException e) {
			 System.out.prinln("Custom Exception Caught: " + e.getMessage());
		 }
		 
	 }
	 
 }
 
 