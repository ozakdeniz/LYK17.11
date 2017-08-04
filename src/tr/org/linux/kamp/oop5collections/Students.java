package tr.org.linux.kamp.oop5collections;

public class Students {
	
	private String name;
	private String id;
	
	
	public Students(String id, String name) {
		this.id = id;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	
	
}
