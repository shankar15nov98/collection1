package com.heraizen.nameSet;

import java.util.Set;

public class Name {
	public static Set<String> checkName(Set<String> set, String name) {

		if (set.iterator().hasNext()) {
			if (set.contains(name)) {
				set.remove(name);
				System.out.println("Removed after equal:");
				set.forEach(System.out::println);
			} else {
				System.out.println("Name not found");
			}
		}
		return set;

	}

}
