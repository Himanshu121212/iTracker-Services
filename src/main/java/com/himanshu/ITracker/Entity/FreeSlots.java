package com.mayank.ITracker.Entity;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class FreeSlots {
	@Id
    private int i_id;
	@OneToMany(targetEntity=Slots.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fs_fk",referencedColumnName="i_id")
	private Set<Slots> slot;
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public Set<Slots> getSlot() {
		return slot;
	}
	public void setSlot(Set<Slots> slot) {
		this.slot = slot;
	}
	public FreeSlots() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FreeSlots(int i_id, Set<Slots> slot) {
		super();
		this.i_id = i_id;
		this.slot = slot;
	}
	
}
