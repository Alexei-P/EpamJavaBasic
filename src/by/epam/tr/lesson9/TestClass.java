package by.epam.tr.lesson9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<String> mll = new MyLinkedList<String>(); 
		mll.addLast("ABC");
		mll.addLast("DEF");
		mll.addLast("QWE");
		mll.addFirst("JJJ");
		mll.addFirst("JJJ");
		System.out.println(mll);
		System.out.println(mll.getSize());
		System.out.println(mll.firstItem);
		System.out.println(mll.lastItem);
		mll.remove("ABC");
		System.out.println(mll);
		System.out.println(mll.getSize());
		mll.remove("DEF");
		System.out.println(mll);
		System.out.println(mll.getSize());
		mll.remove("QWE");
		System.out.println(mll);
		System.out.println(mll.getSize());
		//mll.add(5, "ASD"); IndexOutOfBoundsException
		
	}

}
