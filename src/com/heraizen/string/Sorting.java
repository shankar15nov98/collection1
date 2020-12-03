package com.heraizen.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public String[] getResults(String names[]) {

		List<String> stringList = Arrays.asList(names);

		Collections.sort(stringList);

		int StringLength = stringList.size() / 2;
		for (int i = 0; i < StringLength; i++) {

			System.out.println(stringList.get(i).toLowerCase());

		}
		for (int i = StringLength; i < stringList.size(); i++) {

			System.out.println(stringList.get(i).toUpperCase());

		}

		return names;

	}

}
