package org.newcollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class newraj {
	public static void main(String[] args) {
		
List li=new LinkedList();
li.add(45);
li.add(55);
li.add(2, 34);
int size = li.size();
System.out.println(size);
Object object = li.get(1);
System.out.println(object);
boolean empty = li.isEmpty();
System.out.println(empty);
for (Object object2 : li) {
	System.out.println(object);
}
	
		
	}

	}

