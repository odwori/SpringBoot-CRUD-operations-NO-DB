package com.nodb.entity;

public class ClassRoom {
	private String no;
	private String name;
	private String location;
	
	public ClassRoom(){
		
	}

	public ClassRoom(String no, String name, String location) {
		super();
		this.no = no;
		this.name = name;
		this.location = location;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
