package com.omkar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {

		Test t = () -> {
			System.out.println("Print");
		};

		t.speak();

		Runnable r = () -> {
			for (int i = 0; i < 6; i++) {
				System.out.println(i);

			}
		};

		Thread t1 = new Thread(r);
		t1.start();

		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(12);
		list1.add(112);
		list1.add(62);
		list1.add(82);
		list1.add(120);

		Collections.sort(list1, ((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0));
		System.out.println(list1);
		
		
		
		//predicate -> true or false 
		// has test()
		
		//to check if number is even and greater than 60
		
		Predicate<Integer> p= i->i%2==0;
		Predicate<Integer> p1= i->i>60;
		
		boolean test2 = p.and(p1).negate().test(122);
		
		boolean test = p.test(125);
		
		System.out.println(test2);
		
		

		
		
		
	}

}

@FunctionalInterface
interface Test {

	public void speak();
}
