package com;
import javax.persistence.*;


@Entity
public class PetStore {
	@Id
	private String petStoreName;
	private String address;
	public String getPetStoreName() {
		return petStoreName;
	}
	public void setPetStoreName(String petStoreName) {
		this.petStoreName = petStoreName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public PetStore(String petStoreName, String address) {
		
		this.petStoreName = petStoreName;
		this.address = address;
	}
	

}
