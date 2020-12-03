package com.heraizen.map;

import java.util.Map;
import java.util.Map.Entry;

public class NameMap {

	public static void viewElements(Map<Integer, String> map) {

		for (Entry<Integer, String> ele : map.entrySet()) {
			System.out.println(ele.getKey() + " = " + ele.getValue());
		}
	}

}
