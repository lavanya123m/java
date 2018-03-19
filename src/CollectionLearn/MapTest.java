package CollectionLearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mymap=new HashMap<String,String>();
		mymap.put("IND", "India");
		mymap.put("USA", "Unites states");
		mymap.put("Aus", "Australia");
		mymap.put("RSA", "South Africa");
		mymap.put("RSA", "South Africa");
		
		System.out.println(mymap.size());
		
		Set<String> mySet=mymap.keySet();
		for(String s:mySet){
			System.out.println(s);
			System.out.println(mymap.get(s));
		}
		String value =mymap.get("RSA");
		System.out.println(value);
		
		System.out.println(mymap.containsKey("RSA"));
		System.out.println(mymap.containsValue("Australia"));
		
		System.out.println("Display values");
		Collection<String> myvalues=mymap.values();
		for(String s:myvalues){
			System.out.println(s);
			
		}for(Map.Entry<String,String> myMaps: mymap.entrySet()){
			System.out.println(myMaps.getKey()+":"+myMaps.getValue());
		}
		
		
		/*Map<Customer,Address> myMap=new HashMap<Customer,Address>();
		Customer c1=new Customer(1001,"gsa",32);
	//Address a1=new Address(111,"fd","fd");
		//myMap.put(c1, a1);
		c1.setName("abhjit");
		myMap.get(c1);
		*/
		
		
	}

}
