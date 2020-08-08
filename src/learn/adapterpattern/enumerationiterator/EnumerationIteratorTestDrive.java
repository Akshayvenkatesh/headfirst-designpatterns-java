package learn.adapterpattern.enumerationiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

	public static void main(String[] args) {
		String[] input = {"client","target","adaptee","adapter"};
		Vector<String> l = new Vector<String>(Arrays.asList(input));
		Iterator<?> iterator = new EnumerationIterator(l.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
