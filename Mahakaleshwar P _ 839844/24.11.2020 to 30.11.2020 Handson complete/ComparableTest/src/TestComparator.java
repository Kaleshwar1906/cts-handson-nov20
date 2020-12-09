import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 30000.00));
		list.add(new Items(100, "Mobile", 10000.00));
		list.add(new Items(300, "Laptop", 40000.00));
		System.out.println("Unsorted List");
		for (Items item : list) {
			System.out.println(item);
		}

		System.out.println("Comparator sorting with Sorting class - Id in ascending order");

		Collections.sort(list, new Sorting());                                                           //method 1
		for (Items item : list) {
			System.out.println(item);
		}
		
		System.out.println("Comparator sorting - Id in descending order");
		Comparator<Items> SortByIdDesc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				return o2.getId()-o1.getId();                                                       //method 2
			}
		};
		
		Collections.sort(list, SortByIdDesc);
		for (Items item : list) {
			System.out.println(item);
		}
		
		System.out.println("Comparotor sorting - Price in ascending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		for (Items item : list) {
			System.out.println(item);
		}
		
		System.out.println("Comparotor sorting - Price in descending order");
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items o1, Items o2) {
				return Double.compare(o2.getPrice(), o1.getPrice());                                     //method 3
			}
		});
		
		for (Items item : list) {
			System.out.println(item);
		}
		
		System.out.println("Comparotor sorting - Name in ascending order");
		Collections.sort(list, new Comparator<Items>() {

			public int compare(Items o1, Items o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Items item : list) {
			System.out.println(item);
		}

		
		System.out.println("Comparotor sorting with Another Sorting class - Name in descending order");

		Collections.sort(list, new AnotherSorting());
		for (Items item : list) {
			System.out.println(item);
		}


	}

}
