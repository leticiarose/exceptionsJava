package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
    
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getcheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	
	

}
