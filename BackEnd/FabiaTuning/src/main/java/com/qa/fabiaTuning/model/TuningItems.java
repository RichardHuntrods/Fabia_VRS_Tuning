package com.qa.fabiaTuning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TuningItems {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private Long item_id;

private String nameOfPart;
private int quantity;
private int cost;
private int performanceIncrease;
private boolean highPriority;
private boolean handlingImprovement;

public String setNameOfPart;
public int setQuantity;
public int setCost;
public int setPerformanceIncrease;
public boolean setHighPriority;
public boolean setHandlingImprovement;

public TuningItems() {
	super();	
}

public TuningItems(Long item_id, String nameOfPart, int quantity, int cost, int performanceIncrease,
		boolean highPriority, boolean handlingImprovement) {
		super();
		this.item_id = item_id;
		this.nameOfPart = nameOfPart;
		this.quantity = quantity;
		this.cost = cost;
		this.performanceIncrease = performanceIncrease;
		this.highPriority = highPriority;
		this.handlingImprovement = handlingImprovement;




}

public Long getItem_id() {
	return item_id;
}

public void setItem_id(Long item_id) {
	this.item_id = item_id;
}

public String getNameOfPart() {
	return nameOfPart;
}

public void setNameOfPart(String nameOfPart) {
	this.nameOfPart = nameOfPart;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public int getPerformanceIncrease() {
	return performanceIncrease;
}

public void setPerformanceIncrease(int performanceIncrease) {
	this.performanceIncrease = performanceIncrease;
}

public boolean isHighPriority() {
	return highPriority;
}

public void setHighPriority(boolean highPriority) {
	this.highPriority = highPriority;
}

public boolean isHandlingImprovement() {
	return handlingImprovement;
}

public void setHandlingImprovement(boolean handlingImprovement) {
	this.handlingImprovement = handlingImprovement;
}
}
