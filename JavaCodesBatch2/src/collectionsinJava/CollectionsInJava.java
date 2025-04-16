package collectionsinJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsInJava {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(2);
		set.add(30);
		
		System.out.println(set);
	}

}
