package tr.org.linux.kamp.oop5collections;

public class CollageTest {
	
	public static void main(String[] args) {

	Students student1 = new Students("123", "gulugulucan");
	Students student2 = new Students("456", "dıdıkna");
	Students student3 = new Students("789", "anchan");
	Students student4 = new Students("159", "durunaz");
	Students student5 = new Students("483", "ece");
	Students student6 = new Students("726", "mamu");
	
	Department department = new Department("Yazılım", "Bilgisayar");
	Course course = new Course("Java Programlama", department, "Büşra");
	
	department.addStudent(student1);
	department.addStudent(student2);
	department.addStudent(student3);
	department.addStudent(student6);
	
	course.registerToCourse(student1);
	course.registerToCourse(student2);
	course.registerToCourse(student3);
	
	System.out.println(department.toString());
	
	System.out.println(course.toString());


	
	
	
}
}
