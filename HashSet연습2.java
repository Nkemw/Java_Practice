package project;

import java.util.*;

import javax.lang.model.element.Element;
public class HashSet����2 {
	String value;
	
	public HashSet����2(String value) {
		this.value = value;
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean equals(Object o) {
		if(o instanceof HashSet����2) {
			return ((HashSet����2) o).value.equals(value);
		}
		return false;
	}
	
	public String toString() {
		return "HashSet����2[" + value + "]";
	}
	
	public static void main(String[] args) {
		Set<HashSet����2> h = new HashSet();
		h.add(new HashSet����2("�ȳ�"));
		h.add(new HashSet����2("�ȳ�"));
		System.out.println(h.size());
		System.out.println(h);

	}

}
