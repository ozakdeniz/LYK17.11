package tr.org.linux.kamp.collections;

import java.util.ArrayList;
import java.util.Collections;

//Arrayler aynı tip verileri sıralı birşekilde tutmamızı sağlar ve belli bir uzunluğu vardır bu durum yeni array tanımlayıp silmeyi
//uzunluğu değiştirmeyi zorlaştırır bu durumda arraylist denilen bir listimiz var burda dağınık tutulur ve uzunluk istediğimiz gibi
//değiştirilebilir.


//Linked listin arraylistden farkı 
public class ArrayListImplement<E> extends ArrayList<E> {
	
	//ArrayList<String> stringList = new ArrayList<>();
	
		/*if(stringList.add(item)) //bu bir şekil üstteki de başka bir şekil
			return true;
		else 
			return false;*/
		//stringList.add(item);//eklediğimiz değeri listenin sonuna ekler boolean formundadır eklediği taktirde true döndürür
		
	public boolean addItem(E item) {
		return add( item);
	}
	
	public boolean checkItem(E item ) {
		return contains(item);
	}
	
	public boolean removeItem(E item) {
		return remove(item);
				
	}
	
	public ArrayList<E> getReverse(ArrayList<E> list) {
		 Collections.reverse(list);
		 return list;
	}
	public void removeItem(int index) {
		 remove(index);
	}
	
	public void addItem(int index, E item) {
		 add(index,(E) item);
	}
	
	public void copy(ArrayList<E> list , ArrayList<E> list1) {
		Collections.copy(list, list1);
	}
	public E getItem(int index) {
		return get(index);
		
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return super.remove(index);
	}
}