package tr.org.linux.kamp.genericsandinners;

public class B {
	public static void main(String[] args) {
		InnerInner object = new InnerInner();
		InnerInner.Y.N.L a = new InnerInner().new Y().new N().new L();
		//l nin içinde
		a.setX(123);
		System.out.println(a.getX());
	}

}
