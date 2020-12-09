package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("Student1");			
		list1.add("Student2");
		
		list2.add("Student3");			
		list2.add("Student4");
		
		Map<String, List> map= new HashMap<String, List>();
		map.put("CS", list1);
		map.put("EC", list2);
		
		System.out.println("Enter the department");
		String s=in.next();
		
		if(map.containsKey(s)) {
			System.out.println(map.get(s));
		}
		
	}
	
	
}
