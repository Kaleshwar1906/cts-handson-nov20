
public class Items implements Comparable<Items> {

	private int id;
	private String name;
	private double price;
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Items arg0) {
		// TODO Auto-generated method stub
		//return this.id-arg0.getId();  //sort by id
		//return (int)(this.price-arg0.getPrice()); //sort by price
		return this.name.compareTo(arg0.getName());   //sort by name
	}
	
	

}
