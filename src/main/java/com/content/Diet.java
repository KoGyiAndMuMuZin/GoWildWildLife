package com.content;

public class Diet {
private int dietID;
private String diettype;
private int numberoffeeds;
public int getDietID() {
	return dietID;
}
public void setDietID(int dietID) {
	this.dietID = dietID;
}
public String getDiettype() {
	return diettype;
}
public void setDiettype(String diettype) {
	this.diettype = diettype;
}
public int getNumberoffeeds() {
	return numberoffeeds;
}
public void setNumberoffeeds(int numberoffeeds) {
	this.numberoffeeds = numberoffeeds;
}
public Diet (int _dietID, String _diettype, int _numberoffeeds) {
	this.dietID = _dietID;
	this.diettype = _diettype;
	this.numberoffeeds = _numberoffeeds;
}
public Diet (String _diettype, int _numberoffeeds) {
	this.diettype = _diettype;
	this.numberoffeeds = _numberoffeeds;
}

}
