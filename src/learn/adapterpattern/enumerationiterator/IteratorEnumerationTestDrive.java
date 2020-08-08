package learn.adapterpattern.enumerationiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

	public static void main(String[] args) {
		String[] input = {"client","target","adaptee","adapter"};
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(input));
		Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
