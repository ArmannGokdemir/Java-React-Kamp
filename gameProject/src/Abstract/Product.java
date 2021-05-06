package Abstract;

import Entity.campaign;

public abstract class Product {
	private int id;
	private String name;
	private double price;
	private double discountPrice;
	private String details;
	private campaign campaign;
	

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
		this.discountPrice=price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	public void setCampaign(campaign campaign) {
		this.campaign=campaign;
	}
	public campaign getCampaign() {
		return campaign;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

}
