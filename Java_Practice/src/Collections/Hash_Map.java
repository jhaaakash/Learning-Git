package Collections;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String []args)
	{
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Aakash");
		hm.put(2, "Abhishek");
		hm.put(3, "Aayush");
		
		for(Integer k: hm.keySet())
		{
			System.out.println("keys are:" +k);
		}
		for(String s: hm.values())
		{
			System.out.println("Values are:"+s);
		}
		
	}
}
