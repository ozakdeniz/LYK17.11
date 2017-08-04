package tr.org.linux.kamp.oop4datafiles;

public abstract class BinaryFile extends File {
	
	public BinaryFile(String name, int size, String dataCreated) {
		super(name, size, dataCreated);
		// TODO Auto-generated constructor stub
	}
	
	public BinaryFile() {
		
	}

	abstract BinaryFile getCopy();

}
