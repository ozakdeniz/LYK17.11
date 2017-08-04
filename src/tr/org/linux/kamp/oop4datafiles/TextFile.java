package tr.org.linux.kamp.oop4datafiles;

public abstract class TextFile extends File {


	protected String encoding;
	protected long numChars;
	
	public TextFile() {
		
		
	}
	
	public TextFile(String name, int size, String dataCreated,String encoding, long numChars) {
		super(name, size, dataCreated);
		// TODO Auto-generated constructor stub
		this.encoding = encoding;
		this.numChars = numChars;
		
	}

	public String getEncoding() {
		return encoding;
	}



	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}



	public long getNumChars() {
		return numChars;
	}



	public void setNumChars(long numChars) {
		this.numChars = numChars;
	}
	

}
