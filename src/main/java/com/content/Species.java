package com.content;

public class Species {
private int speciesID;
private String speciestype;
private String speciesgroup;
private String specislifestyle;
private String status;

public int getSpeciesID() {
	return speciesID;
}
public void setSpeciesID(int speciesID) {
	this.speciesID = speciesID;
}
public String getSpeciestype() {
	return speciestype;
}
public void setSpeciestype(String speciestype) {
	this.speciestype = speciestype;
}
public String getSpeciesgroup() {
	return speciesgroup;
}
public void setSpeciesgroup(String speciesgroup) {
	this.speciesgroup = speciesgroup;
}
public String getSpecislifestyle() {
	return specislifestyle;
}
public void setSpecislifestyle(String specislifestyle) {
	this.specislifestyle = specislifestyle;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Species(int _speciesID, String _speciestype, String _speciesgroup, String _specieslifestyle, String _status) {
	this.speciesID = _speciesID;
	this.speciestype = _speciestype;
	this.speciesgroup = _speciesgroup;
	this.specislifestyle = _specieslifestyle;
	this.status = _status;
}
public Species(String _speciestype, String _speciesgroup, String _specieslifestyle, String _status) {
	this.speciestype = _speciestype;
	this.speciesgroup = _speciesgroup;
	this.specislifestyle = _specieslifestyle;
	this.status = _status;
}


}
