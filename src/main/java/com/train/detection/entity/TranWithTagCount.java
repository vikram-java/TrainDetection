package com.train.detection.entity;

public class TranWithTagCount {

	private long countno;
	private int trainno;
	private String dateTime;
	

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public long getCountno() {
		return countno;
	}

	public void setCountno(long countno) {
		this.countno = countno;
	}

	public int getTrainno() {
		return trainno;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public TranWithTagCount(long countno, int trainno,String dateTime) {
		super();
		this.countno = countno;
		this.trainno = trainno;
		this.dateTime=dateTime;
	}
}
