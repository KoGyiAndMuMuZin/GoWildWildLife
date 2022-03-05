package com.content;

public class enclosures {
private int enclosursID;
private String type;
private String location;
public int getEnclosursID() {
	return enclosursID;
}
public void setEnclosursID(int enclosursID) {
	this.enclosursID = enclosursID;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public enclosures(int _enclosuresID, String _type, String _location) {
	this.enclosursID = _enclosuresID;
	this.type = _type;
	this.location = _location;
	
}
public enclosures( String _type, String _location) {
	this.type = _type;
	this.location = _location;
	
}
public int getnumberoffeeds() {
	// TODO Auto-generated method stub
	return 0;
}
}
