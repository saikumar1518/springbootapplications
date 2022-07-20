package com.vidvan.jav8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CreateStreams {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(25);
		al.add(36);
		al.add(96);
		
//		Stream s= al.stream().filter(x->x%2==0);
//	s.forEach(x->System.out.println(x));
		
	al.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
	
	// using mapping(Intermediate Operator)
	
	al.stream().map(x->x*x).forEach(x->System.out.println(x));
	}

}
