package Client1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Mainapp {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
		a1.add("mani");
		a1.add("ajay");
		a1.add("indra");
		 
		LinkedList <String> l1=new LinkedList();
		l1.add("mohi");
		l1.add("ajay");
		l1.add("harsha");
		
		Iterator<String> i1 = l1.iterator();
		while(i1.hasNext()) {
			String s = i1.next();
		}
		Iterator<String> i2 = l1.iterator();
		while(i2.hasNext()) {
			String s= i2.next();
			System.out.println(s+" ");
		}
		
		Vector<Integer> v1 = new Vector();
		v1.add(34);
		v1.add(22);
		v1.add(32);
		Iterator<Integer>i3=v1.iterator();
		while(i3.hasNext()) {
			Integer s= i3.next();
			System.out.println(s+" ");
		}
	
		Stack <Double> s1= new Stack();
		s1.add(10.4);
		s1.add(13.0);
		s1.add(20.7);
		Iterator<Double>i4=s1.iterator();
		while(i4.hasNext()) {
     double y=i4.next();
    if(y<20) {
	i4.remove();
}
		}
				for(double y:s1) {
					System.out.println(y);
				}
			
		
	   HashSet<String> h1 = new HashSet();
		LinkedHashSet <String> h2 = new LinkedHashSet();
		TreeSet<String> h3 = new TreeSet();
		
		h1.add("Ravi");
		h1.add("Siva");
		h1.add("Nischal");
		h1.add("Rohit");
		for(String s: h1)System.out.println(s);
		System.out.println("H2 Set Data");
		
		h2.add("Ravi");
		h2.add("Siva");
		h2.add("Nischal");
		h2.add("Rohit");
	}
	
	
	

}
