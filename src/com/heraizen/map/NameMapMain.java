package com.heraizen.map;

import java.util.HashMap;
import java.util.Map;

public class NameMapMain {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Krish");
		map.put(1002, "Santhosh");
//		map.put(1001, "Shankar");
		NameMap.viewElements(map);
	}
}
