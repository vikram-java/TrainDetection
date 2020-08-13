package com.train.detection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rfid_log")
public class RFIDModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "tag")
	private String tag;

	@Column(name = "antenna")
	private int antenna;

	private int rssi;
	
	@Column(name = "date_time")
	private String dateTime;
	@Column(name = "carriage")
	private Integer carriage;
	
	@Column(name = "read_count")
	private int readCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarriage() {
		return carriage;
	}

	public void setCarriage(Integer carriage) {
		this.carriage = carriage;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
}
