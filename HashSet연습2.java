package project;

import java.util.*;

import javax.lang.model.element.Element;
public class HashSet연습2 {
	String value;
	
	public HashSet연습2(String value) {
		this.value = value;
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean equals(Object o) {
		if(o instanceof HashSet연습2) {
			return ((HashSet연습2) o).value.equals(value);
		}
		return false;
	}
	
	public String toString() {
		return "HashSet연습2[" + value + "]";
	}
	
	public static void main(String[] args) {
		Set<HashSet연습2> h = new HashSet();
		h.add(new HashSet연습2("안녕"));
		h.add(new HashSet연습2("안녕"));
		System.out.println(h.size());
		System.out.println(h);

	}

}
