package com.heraizen.nameSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NameMain {
	public static void main(String[] args) {

		Set<String> namesList = new HashSet<>();
		namesList.add("shankar");
		namesList.add("shiva");
		namesList.add("arun");
		System.out.println("Existing names in the set:");
		namesList.forEach(System.out::println);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name to remove in the set");
		String name = scan.next();
		Name.checkName(namesList, name);
		scan.close();

	}
}
