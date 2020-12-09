import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 30000.00));
		list.add(new Items(100, "Mobile", 10000.00));
		list.add(new Items(300, "Laptop", 40000.00));

		for (Items item : list) {
			System.out.println(item);
		}

		Collections.sort(list);

		System.out.println("Sorted List");
		for (Items item : list) {
			System.out.println(item);
		}

	}
}
