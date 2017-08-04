package tr.org.linux.kamp.oop4datafiles;

public class ExecutableFile extends BinaryFile implements Openable{


	protected String[] platform;
	protected byte[] contents;
	

	public ExecutableFile(String name, int size, String dataCreated) {
		super(name, size, dataCreated);
		// TODO Auto-generated constructor stub
	}
		
	public ExecutableFile(String[] strings) {
		
	}
	
	

	public String[] getPlatform() {
		return platform;
	}



	public void setPlatform(String[] platform) {
		this.platform = platform;
	}



	public byte[] getContents() {
		return contents;
	}



	public void setContents(byte[] contents) {
		this.contents = contents;
	}



	@Override
	BinaryFile getCopy() {
		// TODO Auto-generated method stub
		return new ExecutableFile(getPlatform());
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
