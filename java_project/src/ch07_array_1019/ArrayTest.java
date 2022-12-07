package ch07_array_1019;

import ch05_test_1202.Person;

public class ArrayTest {

	public static void main(String[] args) {

		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		String[] srt1 = new String[] {"lsy", "lsy2"};
		Person[] persons = new Person[] {new Person(), new Person()};
					
		for(int i=0; i<srt1.length; i++){
			 System.out.println(srt1[i]);
			 
				for(int i1=0; i1<persons.length; i1++){
					 System.out.println(persons[i1]);
		}
	}
}
}
