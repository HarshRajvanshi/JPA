package com;

public class Item {
	public Item(String itemName, float price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	private String itemName;
	private float price;
	public Item() {
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
