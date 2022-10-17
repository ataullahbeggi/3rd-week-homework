package core;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : "+ data);
		
	}

}
