package com.bean;

import org.apache.struts.action.ActionForm;

public class TheatreDetails extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int screenId;
	private int screenNumber;
	private int boxSeats;
	private int goldSeats;
	private int silverSeats;
	private int theatreId;
	
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getScreenNumber() {
		return screenNumber;
	}
	public void setScreenNumber(int screenNumber) {
		this.screenNumber = screenNumber;
	}
	public int getBoxSeats() {
		return boxSeats;
	}
	public void setBoxSeats(int boxSeats) {
		this.boxSeats = boxSeats;
	}
	public int getGoldSeats() {
		return goldSeats;
	}
	public void setGoldSeats(int goldSeats) {
		this.goldSeats = goldSeats;
	}
	public int getSilverSeats() {
		return silverSeats;
	}
	public void setSilverSeats(int silverSeats) {
		this.silverSeats = silverSeats;
	}
	

}
