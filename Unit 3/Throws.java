//files reading with throws for vivaan..

import java.io;

public class TestThrows{
	//Declaring that readFile may cause checked IOException..
	static void readFile() throws IOException{
		FileReader file = new File Reader("vivian_notes.txt");
		Buffered Reader br = new BufferedReader(file);
		System.out.println(br.readfile());
		
	}
	
	public static void main(String[]args)
	{
		try{
			readFile();// caller handles the declared exception..
		} catch(IOException e ){
			System.out.println("Caller handled File Error for Vivaan: " + e.getMessage());
			
		}
	}
	
}