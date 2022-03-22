package maven.demo.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Comp {
	
	public static void main(String[] args) {
		ArrayList<Student> stList= new ArrayList<Student>();
		stList.add(new Student(102,"Sayan","ECE",'A'));
		stList.add(new Student(105,"Raj","EE",'B'));
		stList.add(new Student(103,"Suvra","ME",'C'));
		stList.add(new Student(101,"DEV","CSE",'A'));
		
		
		System.out.println("Initial Student List");
		stList.forEach(e -> System.out.println(e.toString()));

		Collections.sort(stList);

		System.out.println("after sorting Student List");
		stList.forEach(e -> System.out.println(e.toString()));
	}

}
