package collectionFramework.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class RulesAndMethods {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

//1.addElement()- same as add()

		v.addElement(10);
		v.addElement(11);
		v.addElement(12);
		v.addElement(13);
		v.addElement(14);
		v.addElement(15);

//2. it uses Enumeration instead of Iterator	

		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			Integer i = en.nextElement();
			System.out.println(i);

			/*
			 * or
			 * 
			 * int in = en.nextElement();
			 * 
			 * System.out.println(in);
			 */
		}

	}

}
