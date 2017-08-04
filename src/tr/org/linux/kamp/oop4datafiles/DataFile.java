package tr.org.linux.kamp.oop4datafiles;

public class DataFile extends BinaryFile implements Openable {
	
	
	protected String compressionFormat;
	protected ExecutableFile opensWith;
	protected boolean[] bits;
	
	
	public DataFile() {

	}
	
	public DataFile(String name, int size, String dataCreated,String compressionFormat, ExecutableFile opensWith) {
		super(name, size, dataCreated);
		this.compressionFormat = compressionFormat;
		this.opensWith = opensWith;
		

	}

	



	public String getCompressionFormat() {
		return compressionFormat;
	}

	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}

	public ExecutableFile getOpensWith() {
		return opensWith;
	}

	public void setOpensWith(ExecutableFile opensWith) {
		this.opensWith = opensWith;
	}

	public boolean[] getBits() {
		return bits;
	}

	public void setBits(boolean[] bits) {
		this.bits = bits;
	}

	@Override
	BinaryFile getCopy() {
		// TODO Auto-generated method stub
		return new DataFile(getCompressionFormat(),20, "data", "data2", getOpensWith());
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
