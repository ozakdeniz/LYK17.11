package tr.org.linux.kamp.genericsandinners;

/*javada listelerin tututlduğu collection adında bir sınıfımız var array listler de bu sınıfta tutulur <> bu gösterime
 * diamond gösterimi denir. Diamond gösterimi içine herhangi bir gösterimi değişken alabilir. diamond gösterimine generics
 * denir. Genericlerde list tanımlarken list yazıyoruz diamond içine nasıl kullanmak istiyorsak onu yazıyoruz. Collectionun
 * içinde listler setler ve mapler vardır. set kümedir setin içinde bir eleman birden fazla bulunamaz oysa listlerde
 * bir değeri birden fazla girebilirsin mapler ise < K key, V value> şeklinde tutulur.keyler uniquedir tektirler <1,AB>
 * <2,AB>   <2, AC> son şekil taımlanamaz çünkü 2 keyi daha önce girildi böyle bir durumda hata verir. List map set util library
 * sinin içindedir.Liste örnek ArrayList LinkedList Linkedlist daha kapsamlıdır Sete örnek HashSet Mape örnekse HashMap verilebilir */

public class GenericsExample/*<T>*/ {// t herhangi bir tip olabiilir t type a tekabul ediyor.
	
	int value;
	String abc;
	/*T t;// t herhangi bir tip olabilir

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		
		GenericsExample<String/*buraya t yazınca hata veriyo neden belirli bişey tanımlamamızı istiyor*//*> genericEx = new GenericsExample<>();
		GenericsExample g = new GenericsExample<String>();
		
		
	}*/

}
