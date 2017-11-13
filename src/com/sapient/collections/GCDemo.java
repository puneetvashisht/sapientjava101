package com.sapient.collections;

public class GCDemo {

	public static void main(String[] args) {
		
		String str = "1";
		
		for(int i=2; i<1000000000; i++){
			str = str+i;
		}
		
		System.out.println(str);

	}

}
