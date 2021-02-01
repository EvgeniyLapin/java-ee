package com.senla.model;

public class Garage {
	
	private int idPlace;
	private String place;
	
	public Garage(int idPlace, String place) {
		super();
		this.idPlace = idPlace;
		this.place = place;
	}

	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Garage [placeNum=" + idPlace + ", place=" + place + "]";
	}
	
	
	
	

}
