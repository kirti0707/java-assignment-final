package assignment;

import java.util.*;

public class Duplicates {
	public static void main(String[] args)
	{
		ArrayList<String> Al= new ArrayList<String>();
		Al.add("a");
		Al.add("a");
		Al.add("a");
		Al.add("b");
		Al.add("b");
		Al.add("b");
		Set<String> st= new HashSet<String>(Al);
		
		for(String str:st)
			System.out.println(str +" frequency is "+Collections.frequency(Al,str));
		
			
		
	}

}

