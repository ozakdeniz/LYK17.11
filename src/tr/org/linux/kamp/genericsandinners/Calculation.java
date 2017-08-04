package tr.org.linux.kamp.genericsandinners;

public class Calculation extends GenericsExample{/*Bu classın iki inner classı var*/
	//bu sınıfın extend ettiği herşeye inner classlarda ulaşabiliyor

	private int x ;
	
	public interface Hey{
		void deneme();
	}
	
	public class Adf implements Hey{

		@Override
		public void deneme() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class Toplama extends ParentCalcu{
		//dış sınıfın extend ettiği şeylere ve orda tanımlı private fieldına metodlarına da ulaşabildiği halde 
		//inner classta tanımladığımız bir fielda başka bir inner class ulaşamaz bu yüzdem burda tanımlı y ye 
		//cıkarma sınıfı ulaşamıyor.
		int y = x+1;
		int b = y+1;
		String string = abc+ "asdf";

	}
	
	
	public class Cıkarma extends MostParentCalcu{
		//int z = y+1;
		String string = abc+ "asdf";
	}
	
	public class Carpma {
		
		
	}
}
