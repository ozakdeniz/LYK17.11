package tr.org.linux.kamp.oop4datafiles;

public class PlainTextFile extends TextFile implements Openable{


	protected String[] lines;
	
	public PlainTextFile() {
		
	}

	public PlainTextFile(String name, int size, String dataCreated, String encoding, long numChars) {
		super(name, size, dataCreated, encoding, numChars);
		// TODO Auto-generated constructor stub
	
		
	}


	
	public String[] getLines() {
		return lines;
	}



	public void setLines(String[] lines) {
		this.lines = lines;
	}



	@Override
	void onClick() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
