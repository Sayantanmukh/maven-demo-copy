package maven.demo.coll;

import java.util.*;

public class Setdemo {
	public static void main(String args[]) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
		
		
		//Arraylistdemo al =new Arraylistdemo();
		//hs.addAll((Collection<? extends String>) al);
		//System.out.println(hs);
		
		//hs.toArray(String[] a);
	}

}
