package com.collection;

import java.util.Comparator;

public class SortByID implements Comparator<SavingAccount> {

	//sorting by acc_ID
	@Override
	public int compare(SavingAccount a, SavingAccount b) {
		
		return a.getAcc_ID() - b.getAcc_ID();
	}

}
