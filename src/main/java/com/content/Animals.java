package com.content;

public class Animals {
	private int animalID;
	private String animalname;
	private String gender;
	private int year;
	private int enclosuresID;
	private int speciesID;
	private int dietID;
	private int keeperID;
	private String keepername;
	private int totalanimals;
	
	public int getAnimalID() {
		return animalID;
	}
	public void setAnimalID(int animalID) {
		this.animalID = animalID;
	}
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public String getGenter() {
		return gender;
	}
	public void setGenter(String genter) {
		this.gender = genter;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEnclosuresID() {
		return enclosuresID;
	}
	public void setEnclosuresID(int enclosuresID) {
		this.enclosuresID = enclosuresID;
	}
	public int getSpeciesID() {
		return speciesID;
	}
	public void setSpeciesID(int speciesID) {
		this.speciesID = speciesID;
	}
	public int getDietID() {
		return dietID;
	}
	public void setDietID(int dietID) {
		this.dietID = dietID;
	}
	public int getKeeperID() {
		return keeperID;
	}
	public void setKeeperID(int keeperID) {
		this.keeperID = keeperID;
	}
	public Animals (int _animalID, String _animalname, String _genter, int _year,
			int _enclosuresID, int _speciesID, int _dietID, int _keeperID) {
			this.animalID = _animalID;
			this.animalname = _animalname;
			this.gender = _genter;
			this.year = _year;
			this.enclosuresID = _enclosuresID;
			this.speciesID = _speciesID;
			this.dietID = _dietID;
			this.keeperID = _keeperID;
	}
	public String getKeepername() {
		return keepername;
	}
	public void setKeepername(String keepername) {
		this.keepername = keepername;
	}
	public int getTotalanimals() {
		return totalanimals;
	}
	public void setTotalanimals(int totalanimals) {
		this.totalanimals = totalanimals;
	}
	public Animals (String _animalname, String _gender, int _year,
			int _enclosuresID, int _speciesID, int _dietID, int _keeperID) {
			this.animalname = _animalname;
			this.gender = _gender;
			this.year = _year;
			this.enclosuresID = _enclosuresID;
			this.speciesID = _speciesID;
			this.dietID = _dietID;
			this.keeperID = _keeperID;
	}
	public Animals (int _animalId,String _name,String _gender,int _year,int _keeperId,String _keepername) {
		this.animalID=_animalId;
		this.animalname=_name;
		this.gender=_gender;
		this.year=_year;
		this.keeperID=_keeperId;
		this.keepername=_keepername;
	}
	public Animals (String _keepername, int _totalanimals) {
		this.keepername=_keepername;
		this.totalanimals=_totalanimals;
	}
}
