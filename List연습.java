package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class List¿¬½À {

	public static void main(String[] args) {
		String[] names1 = {"»ç½¿", "È£¶ûÀÌ", "¹Ù´ÙÇ¥¹ü", "°õ"};
		
		List<String> list = Arrays.asList(names1);
		
		list.set(1,  "¾Þ¹«»õ");
		for (String s : list)
			System.out.print(s + "\t");
		System.out.println();
		
		list.sort((x, y) -> x.length() - y.length());
		
		String[] name2 = list.toArray(new String[list.size()]);
		for (int i = 0; i < name2.length; i++)
			System.out.print(name2[i] + "\t");
		
	}

}
