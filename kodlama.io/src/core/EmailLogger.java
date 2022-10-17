package core;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String data) {
		System.out.println("Maile loglandı : "+data);
		
	}
	
}
