package com.train.detection.entity;

public class ViewTagIds {
	
	private String tag;		
	private Integer carriage;	
	private int antenna;
	private int rssi;	
	private int readCount;
	private long tagCount;
	
	public ViewTagIds(String tag, Integer carriage, int antenna, int rssi, int readCount, long tagCount) {
		super();
		this.tag = tag;
		this.carriage = carriage;
		this.antenna = antenna;
		this.rssi = rssi;
		this.readCount = readCount;
		this.tagCount = tagCount;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getCarriage() {
		return carriage;
	}

	public void setCarriage(Integer carriage) {
		this.carriage = carriage;
	}

	public int getAntenna() {
		return antenna;
	}

	public void setAntenna(int antenna) {
		this.antenna = antenna;
	}

	public int getRssi() {
		return rssi;
	}

	public void setRssi(int rssi) {
		this.rssi = rssi;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public long getTagCount() {
		return tagCount;
	}

	public void setTagCount(long tagCount) {
		this.tagCount = tagCount;
	}
	
	
}
