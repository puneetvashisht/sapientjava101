package com.sapient.collections;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	String name;
	String season;
	Date expiryDate;
	Fruit(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Fruit o) {
		if(o.name.equals(this.name)){
			return o.season.compareTo(this.season);
		}
		return o.name.compareTo(this.name);
	}
	


	
	
}

public class CollectionDemo {

	public static void main(String[] args) {
		
		Set<Fruit> fruits = new TreeSet<>();
		fruits.add(new Fruit("Apples"));
		fruits.add(new Fruit("Grapes"));
		fruits.add(new Fruit("Oranges"));
		
		System.out.println(fruits);
		
		System.out.println(fruits.contains(new Fruit("Apples")));

	}

}
