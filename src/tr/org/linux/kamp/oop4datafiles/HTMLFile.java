package tr.org.linux.kamp.oop4datafiles;

import java.util.ArrayList;

public class HTMLFile extends TextFile implements Openable{

	protected ExecutableFile browserCompatibleWith;
	protected ArrayList<HTMLFile> linksTo;
	protected String HTMLVersion;
	
	
	public HTMLFile(String name, int size, String dataCreated, String encoding, long numChars, ExecutableFile browserCompatibleWith, ArrayList<HTMLFile> linksTo, String HTMLVersion) {
		super(name, size, dataCreated, encoding, numChars);
		// TODO Auto-generated constructor stub
		this.HTMLVersion = HTMLVersion;
		this.linksTo = linksTo;
		this.browserCompatibleWith = browserCompatibleWith;
		
	}

	public HTMLFile(ExecutableFile exfile) {
		
	}
	public HTMLFile() {
		
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
