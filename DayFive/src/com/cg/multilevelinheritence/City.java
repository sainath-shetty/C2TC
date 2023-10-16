package com.cg.multilevelinheritence;

public class City extends State {
private String cityName;
private String area;
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}

}
