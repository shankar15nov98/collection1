package com.heraizen.list;

import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		ListEmpty l1 = new ListEmpty();
		l1.showElements(list);

	}
}
