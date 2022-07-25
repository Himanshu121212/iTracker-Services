package com.mayank.ITracker.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slots {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slot_id;
	private LocalDate date;
	private LocalTime time;
//	private boolean status=true;
	private int status = 1;
	public int getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Slots() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Slots(int slot_id, LocalDate date, LocalTime time, int status) {
		super();
		this.slot_id = slot_id;
		this.date = date;
		this.time = time;
		this.status = status;
	}
	//corrected
	@Override
	public String toString() {
		return "Slots [slot_id=" + slot_id + ", date=" + date + ", time=" + time + ", status=" + status + "]";
	}
	
	
}
