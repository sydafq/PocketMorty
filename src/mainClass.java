
public class mainClass {
	
	public static void main(String[] args){

		dataMorty trial = new dataMorty();
		
		try {
			trial.readtheFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
}
