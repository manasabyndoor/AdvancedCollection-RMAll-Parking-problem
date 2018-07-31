//advanced collection -creating 5 objects and storing them into arraylist and linkedhashset
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();

		// creating objects of savings account
		SavingAccount sa1 = new SavingAccount(10000.0, 101, "ananya", true);
		SavingAccount sa2 = new SavingAccount(20000.0, 105, "canvas", true);
		SavingAccount sa3 = new SavingAccount(30000.0, 102, "barti", true);
		SavingAccount sa4 = new SavingAccount(40000.0, 107, "deepa", true);
		SavingAccount sa5 = new SavingAccount(40000.0, 107, "deepa", true);

		// passing objects as values to arraylist
		list.add(sa1);
		list.add(sa2);
		list.add(sa3);
		list.add(sa4);
		list.add(sa5);
		Collections.sort(list, new SortByID());

		// printing values
		list.stream().forEach((list1) -> System.out.println(list1));
		System.out.println("\n");

		Set<Object> set = new LinkedHashSet<>();
		// passing objects as values to linkedhash list
		set.add(sa1);
		set.add(sa2);
		set.add(sa3);
		set.add(sa4);
		set.add(sa5);

		System.out.println("\n");
		// printing values
		set.stream().forEach((list1) -> System.out.println(list1));
		System.out.println("\n");
		// printing
		set.stream().forEach((set1) -> System.out.println(set1));
	}
}
