import java.io.*;

//Class extracts data from a readme file and scans the input on which Morty to find
public class dataMorty {
	
	public void readtheFile() throws Exception{
		
	FileReader fr = new FileReader("data.txt"); 
	BufferedReader br = new BufferedReader(fr); 
	String s; 
	
		while((s = br.readLine()) != null) { 
		System.out.println(s);
		}
		
		fr.close();
	}
	
}
