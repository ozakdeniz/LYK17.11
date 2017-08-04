package tr.org.linux.kamp.oop4datafiles;

import java.util.ArrayList;

public class FileEditorApp {
	
	public static void main(String[] args) {
		DataFile datafile = new DataFile();
		PlainTextFile txt = new PlainTextFile();
		ExecutableFile exfile = new ExecutableFile("gnu-linux", 20, "nisan93");
		HTMLFile htmfile = new HTMLFile(exfile);
		HTMLFile home = new HTMLFile(exfile);

		
		datafile.setCompressionFormat("data");
		datafile.setDataCreated("mart2001");
		
		txt.setName("text dosyası1");
		
		exfile.setDataCreated("ocak98");
		
		htmfile.setNumChars(20);
		ArrayList<HTMLFile> navigation = new ArrayList<>();
		navigation.add(htmfile);
		navigation.add(home);
		
		
		System.out.println("Aata dosyası için atanan değerler        :  "+ datafile.getCompressionFormat()+", "+
		datafile.getDataCreated()+", "+datafile.getName()+", "+datafile.getSize()+", "+datafile.getOpensWith());
		
		System.out.println("Text dosyası için atanan değerler        :  "+ txt.getDataCreated()+", "+ 
		txt.getEncoding()+", "+ txt.getName()+", "+txt.getNumChars()+", " +txt.getSize()+", "+txt.getLines());
		
		System.out.println("Çalışabilir dosya için atanan değerler   :  "+ exfile.getDataCreated()+", " + 
		exfile.getName()+", "+ exfile.getContents()+", "+exfile.getPlatform());
		
		System.out.println("Html dosyası için atanan değerler        :  " +htmfile.getDataCreated()+", "+ 
		htmfile.getEncoding()+", "+ htmfile.getName()+", "+ htmfile.getNumChars()+", "+htmfile.getSize());
	}
	
	 /*SANALLAŞTIRMA : yapay zeka soyutlama işletim sistemi nedir? işletim sistemi olmadan da donanım üzerinden programlar	 
	 * elektronik yapılarla bağlanmalarla uğraşmak gerekir ki bu da zordur herkes yapamazmış bu yüzden işletim sistemi oluşturulmuş
	 * çalıştırılabilir ancak ve yazılımcıyla bilgisayar donanımı arasındaki iletişimi sağlar donanımı soyutlaştırır ve 
     * yazılımcının yazdığı komutları doğrudan donanımın anlicağı şekilde gönderir aynı zamanda birden fazla program 
	 * koşturabilmemizi de sağlar ve bizim donanımda nolduğundan haberimiz olmaaz bunun bir üst versiyonu daha vardır bazı 
	 * programlama dilleri işletim sitemi ile arasına bir sanallaştırma daha yapıyor komutu giriyoruz ve direk çıktı geliyor 
	 * bizim işletim siteminde ne döndüğünden haberimiz olmasına gerek kalmıyor ki donanımla bağ tamamen kopuyor sanal 
	 * makineler dilleri dönüştürüp aktarıyor.Bunun bir üst düzeyi de işletim sistaminin üstüne hypervisor (sanal makine
	 * türleri virtualbox vb.)tabaka koyup başka işletim sistemleri de kurabiliyoruz. iki tür hypervisor vardır Typex1, Typex2
	 * sanallaştırmalarla kurulan sistemler ana sistem gibi hızlı çalışır aslında ama ekran kartları vb bunlar için  
	 * oluşturulmadığı için performansta düşmeler olur sanallaştırmayı destekleyen donanımlar kullanılmalıdır. 
	 * Sanal mmakine aslında bizim ne yaptığımızı bilmemizi sağlar bu yüzden sanal makine öğrenilmelidir.java jvm üzerinde
	 * java virtual machine sanal makine üzerinde çalışır jvm üzerinde başka bir dille geliştirilmiş bir program
	 * jvm için bir java uygulamasıdır fakat bizim için jvm üzerinde java dışında bir programlama diliyle yazılmıştır.
	 * bir java programının yazılabilmesi için bilgisayarda jdk olması lazım başka bir bilgisayarda çalıştırılabilmesi
	 * içinde o bilgisayarda jre olması lazım jdk nın içinde jre vardır jre nin içinde de jvm vardır program jvm de 
	 * çalışır aslında sadece jvm kurulu olsa da çalışır. java write once run everywhere javanın diğer dillerden farkı 
	 * her platformda çalıştırılabilir olması her cihaz programlanabilir olcak her cihaz internete bağlanabilicek
	 * java nın bir diğer özelliği de fırlatılan exceptionları yakalamak hata payını en aza düşürmek doğası gereği virtual machine
	 * olmadan çalışmaz her platformda çalışabilmesi için bir virtual machine olması gerekir bu yüzdendir ki java donanıma 
	 * ulaşama lüksü olmayan bir programlama dilidir*/

}
