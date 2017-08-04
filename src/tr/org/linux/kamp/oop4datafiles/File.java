package tr.org.linux.kamp.oop4datafiles;

public abstract class File {
	
	protected String name;
	protected int size;
	protected String dataCreated;
	
	public File(String name, int size, String dataCreated) {
		this.name = name;
		this.size = size;
		this.dataCreated = dataCreated;
	}
	
	public File() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDataCreated() {
		return dataCreated;
	}

	public void setDataCreated(String dataCreated) {
		this.dataCreated = dataCreated;
	}

	abstract void onClick();

}
