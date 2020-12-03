package com.heraizen.cube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cube {

	public Map<Integer, Integer> getMap(Integer numbers[]) {

		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

		Arrays.stream(numbers).forEach(number -> {
			numberMap.put(number, (int) Math.pow(number, 3));

		});

		for (Entry<Integer, Integer> number : numberMap.entrySet()) {
			System.out.println(number);
		}

		return numberMap;

	}

}
