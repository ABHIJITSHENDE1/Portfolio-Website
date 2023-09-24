package com.pojo;

public class MessagePojo {
	private int sno;
	private String name;
	private String email;
	private String message;
	private String datetime;
	public MessagePojo(int sno, String name, String email, String message, String datetime) {
		super();
		this.sno = sno;
		this.name = name;
		this.email = email;
		this.message = message;
		this.datetime = datetime;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getMessage() {
		return message;
	}
	public String getDatetime() {
		return datetime;
	}
	
	
	
}
