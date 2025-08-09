package com.wrapper.practice;
import java.util.*;

public class WrapperClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< 5; i++) {
			list.add(i);//autoboxing
		}
		int n = list.get(2);//unboxing
		System.out.println(n);

	}

}
