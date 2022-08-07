package com.himanshu.ITracker.Entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SlotsBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slot_b_id;
		
	private int r_id;
	private int i_id;
	private String candidate_name;

		
	public SlotsBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SlotsBook(int slot_b_id, int i_id, int r_id, String candidate_name) {
	super();
	this.slot_b_id = slot_b_id;
	this.i_id = i_id;
	this.r_id = r_id;
	this.candidate_name = candidate_name;
	}
	
	public int getSlot_b_id() {
		return slot_b_id;
	}
	public void setSlot_b_id(int slot_b_id) {
		this.slot_b_id = slot_b_id;
	}
	
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
		
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	
	public String getCandidate_name() {
		return candidate_name;
	}
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	@Override
	public String toString() {
		return "SlotsBook [slot_b_id=" + slot_b_id + ", r_id=" + r_id + ", i_id=" + i_id + ", candidate_name="
				+ candidate_name + "]";
	}
	
	
	

}