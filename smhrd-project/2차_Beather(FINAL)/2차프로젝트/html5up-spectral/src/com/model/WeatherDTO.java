package com.model;

public class WeatherDTO {
	private int index_num;
	private String location;
	private String day;
	private String temp;
	private String humidity;
	private String rainprob;
	private String sky;
	
	

	public WeatherDTO(int index_num, String location, String day, String temp, String humidity, String rainprob,
			String sky) {
		super();
		this.index_num = index_num;
		this.location = location;
		this.day = day;
		this.temp = temp;
		this.humidity = humidity;
		this.rainprob = rainprob;
		this.sky = sky;
	}

	public int getIndex_num() {
		return index_num;
	}

	public void setIndex_num(int index_num) {
		this.index_num = index_num;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getRainprob() {
		return rainprob;
	}

	public void setRainprob(String rainprob) {
		this.rainprob = rainprob;
	}

	public String getSky() {
		return sky;
	}

	public void setSky(String sky) {
		this.sky = sky;
	}
	
	
	
	
}
