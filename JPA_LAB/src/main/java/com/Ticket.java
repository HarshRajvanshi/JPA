package com;
import javax.persistence.*;

@Entity
public class Ticket {
	
	private String source;
	private String destination;
	@Id
	private float price;
	private int date;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(String source, String destination, float price, int date) {
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.date = date;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	

}
