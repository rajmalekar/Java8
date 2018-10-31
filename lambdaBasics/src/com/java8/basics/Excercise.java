/**
 * 
 */
package com.java8.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author User
 *
 */
public class Excercise {

	/**
	 * @param args
	 *            Java7 way
	 */
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Raj", "Malekar", 28), new Person("Priya", "Bulule", 25),
				new Person("Mahesh", "Chitkote", 25), new Person("Pooja", "Birajdar", 20));

		// sort all persons in list
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		// print all persons in list
		printAll(people);
		// print condationally
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("B");
			}
		});

		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	public boolean test(Person p);
}
