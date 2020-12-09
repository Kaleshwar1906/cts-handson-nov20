package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestProductSelection {

	public static void main(String[] args) {
		List<Laptop> laptops = Laptop.fetchLaptops();
		List<Laptop> particularLaptops = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getBrandName().equals("Lenova"))
				particularLaptops.add(laptop);
		}
		Collections.sort(particularLaptops, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return Double.compare(o2.getRatings(), o1.getRatings());
			}
		});
		for(Laptop laptop : particularLaptops) {
			System.out.println(laptop);
		}
		System.out.println("STREAMS");

		List<Laptop> list=laptops.stream()
		.filter(item->item.getBrandName().equals("Lenova")||item.getBrandName().equals("Acer"))
		.filter(item->item.getPrice()>30000)
		.sorted((e1,e2)->Double.compare(e2.getRatings(), e1.getRatings()))
		.collect(Collectors.toList());
		
		list.forEach(item ->System.out.println(item));
		
		System.out.println("SEQUENTIAL STREAMS");
		laptops.stream().filter(item->item.getRatings()>4.3).forEach(item ->System.out.println(item));
		System.out.println("PARALLEL STREAMS");
		laptops.parallelStream().filter(item->item.getRatings()>4.3).forEach(item ->System.out.println(item));
		
		
	}

}
