package by.epam.tr.lesson8;
import java.util.HashSet;
import java.util.Set;

import by.epam.tr.lesson8.MySet;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySet<String> set = new MySet<>();
		set.add("ABC");
		set.add("DEF");
		set.add("GHI");
		set.add("GHI");
		set.add("SS");
		//set.add(null);
		System.out.println(set);
		set.remove("ABC");
		set.remove("GHI");
		set.remove("DEF");
		set.remove("SS");
		
		set.add("GHI");
		set.add("GHI");
		
		System.out.println(set);
		
		MySet<String> set2 = (MySet<String>) set.clone();
		System.out.println(set2);
	
	}

}
