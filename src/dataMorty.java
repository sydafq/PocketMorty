import java.io.*;
import java.util.*;

//Class extracts data from a readme file and scans the input on which Morty to find
public class dataMorty {
	
	public void inputData(){
		
		String compare;
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Input Morty Name:");
		compare = user_input.next();
		
		try {
			readtheFile(compare);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void readtheFile(String compare) throws Exception{
		
	FileReader fr = new FileReader("data.txt"); 
	BufferedReader br = new BufferedReader(fr); 
	String s; 
	
	System.out.println(compare);
	
		while((s = br.readLine()) != null) { 
		System.out.println(s);
		
		
		}
		
		fr.close();
	}
	
}
