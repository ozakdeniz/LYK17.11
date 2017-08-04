package tr.org.linux.kamp.genericsandinners;
/*inheritance da birden fazla extends yapamyız birden fazla implements yapabiliriz ancak biz birden fazla extends yapmak istiyoruz
 * yada parent classın içinde bir private field var ve biz ona ulaşmak istiyoruz bunun için inner classlar vardır javada
 * bir sınıfın içinde başka bir class açabiliriz ve ana classı bi sınıfa extends ederken iç sınıftanda başka bir sınıfı
 * extends edebiliriz böylece multiple inheritance sağlamış oluruz aynı zamanda iç sınıf dış sınıfın private fieldlarına da 
 * ulaşabilir yani inner classlarla bir taşla iki kuş vurabiliyoruz.*/
public class Account extends B{
	
	private int x;
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public class C extends D{
		/*C nin şu anda iki tane parentı var biri B diğeri D A'nınsa inner classıdır.*/
		int b;
		
		public void hede() {
			
		}
		
	}

}
