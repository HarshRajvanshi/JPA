package com;

import java.util.List;

public class Sales {

	private List<Item> itemList;

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public List<Item> getItemList() {
		return itemList;
	}
	
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(List<Item> itemList) {
		this.itemList=itemList;
	}
}
