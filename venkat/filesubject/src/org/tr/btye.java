package org.tr;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


class btye {

	public static void main(String[] args)  {
		List gh=new ArrayList();
		gh.add(90);
		gh.add(78);
		gh.add(56);
		gh.add(780);
		

		System.out.println(gh.indexOf(56));
System.out.println(gh);
for (Object object : gh) {
	System.out.println(object);
	
}

		List hj=new LinkedList(gh);
		System.out.println(hj);
	
		
		TreeSet ty=new TreeSet(hj);
		boolean addAll = ty.addAll(hj);
		
		System.out.println(ty);
		HashSet ui=new HashSet(ty);
		
		System.out.println(ui);
		LinkedHashSet lk=new LinkedHashSet(ui);
		System.out.println(lk);
		for (Object object : lk) {
			System.out.println(object);
		}

	}
}



