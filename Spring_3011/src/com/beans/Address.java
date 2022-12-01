package com.beans;

public class Address {
	int addressid;
	String areaName;
	String cityName;
	public Address() {
		
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	
	
	
	

}
