package Entity;

public class campaign {
	private String id;
	private double discount;
	private String name;
	
	public campaign(String id, double discount, String name) {
		
		this.id = id;
		this.discount = discount;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount2) {
		this.discount = discount2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
