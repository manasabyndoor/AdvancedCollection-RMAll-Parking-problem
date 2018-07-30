//advanced collection -creating 5 objects and storing them into arraylist and linkedhashset
package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class BankAccountList {
	public static void main(String args[]) {
		ArrayList<SavingAccount> list = new ArrayList<SavingAccount>();
		Set<Object> set = new LinkedHashSet<>();
		// creating objects of savings account
		SavingAccount sa1 = new SavingAccount(10000.0, 12347, "manasa", true);
		SavingAccount sa2 = new SavingAccount(20000.0, 1244, "manas", true);
		SavingAccount sa3 = new SavingAccount(30000.0, 12324, "mana", true);
		SavingAccount sa4 = new SavingAccount(40000.0, 12344, "mansa", true);
		SavingAccount sa5 = new SavingAccount(40000.0, 12344, "mansa", true);

		// passing objects as values to arraylist
		list.add(sa1);
		list.add(sa2);
		list.add(sa3);
		list.add(sa4);
		
		// printing values
		list.stream().forEach((list1) -> System.out.println(list1));
		System.out.println("\n");
		
		// passing objects as values to linkedhash list
		set.add(sa1);
		set.add(sa2);
		set.add(sa3);
		set.add(sa4);
		
		// printing values
		set.stream().forEach((list1) -> System.out.println(list1));

	}

}
