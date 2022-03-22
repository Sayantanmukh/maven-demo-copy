package maven.demo.coll;

import java.util.*;

public class Hashmapdemo {
	public static void main(String args[]) {
		
		Map<String, Double> hm = new HashMap<String, Double>();

		
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));

		
		Set set = hm.entrySet();

		
		Iterator i = set.iterator();

		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}

		

		double balance = ((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", (balance + 1000));
		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
		
		hm.replace("Jane Baker", 100.2);
		System.out.println("Jane Baker's new balance: " + hm.get("Jane Baker"));
		
	}

}
