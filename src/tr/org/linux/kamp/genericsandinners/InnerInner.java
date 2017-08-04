package tr.org.linux.kamp.genericsandinners;

public class InnerInner extends Account {
	
	public InnerInner() {
	}
	
	public class Y extends B{
		
		public class N extends D{
			
			public class L extends Calculation{
				
				//L sınıfının parentleri Cal.,D,B,Account
				//ne kadar içiçe olursa olsun birinin içine interface oluşturursak en dıştaki sınıftan 
				//interfacein olduğu sınıfa kadar . . giderek ve enson interface i yazarak da ulaşabiliriz
				
				 int x;
				 
				public int getX() {
					return x;
				}

				void setX(int x) {
					 this.x =x;
					 System.out.println("inner classtan metod çekiyoruz :"+x);
					 
					 //Bu işlemi B sınıfnda yapıcam
				 }
				
			}
		}
		
	}

}
