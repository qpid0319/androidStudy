package com.cupid0319.andcustomview2;

public class Weather {
	private String day;
	private int Icon;
	private String comment;

	public Weather(String day, int icon, String comment) {
		super();
		this.day = day;
		Icon = icon;
		this.comment = comment;
	}	
	
	public String getDay() {
		return day;
	}

	public int getIcon() {
		return Icon;
	}

	public String getComment() {
		return comment;
	}

}
