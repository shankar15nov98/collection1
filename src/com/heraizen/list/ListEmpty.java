package com.heraizen.list;

import java.util.List;

public class ListEmpty {

	public void showElements(List<String> list) {

		boolean ans = list.isEmpty();

		if (ans == true)
			System.out.println("List is Empty");

		else
			for (String fruit : list)
				System.out.println(fruit);

	}

}
