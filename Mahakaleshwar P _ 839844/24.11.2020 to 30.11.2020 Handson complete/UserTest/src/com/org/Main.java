package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<User> list=new ArrayList<User>();
		Scanner in =new Scanner(System.in);
		
		list.add(new User(1,"Alex","alex"));
		list.add(new User(2,"Bharath","alexq"));
		list.add(new User(3,"Catherine","alexqq"));
		list.add(new User(4,"Devi","alexqqq"));
		list.add(new User(5,"Eniyan","alexqqqq"));
		
		for(User user: list) {
			if(user.getName().length()>5)
			System.out.println(user.getName());
		}
		}
	
	}

