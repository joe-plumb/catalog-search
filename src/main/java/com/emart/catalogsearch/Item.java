package com.emart.catalogsearch;

import javax.persistence.GeneratedValue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue
	private long id;
	
	private String itemname;
	
	private String categoryfull;
	
	private String fromdate;
	
	private String todate;
	
	public Item(long id, String itemname, String categoryfull, String fromdate, String todate) {
		this.id = id;
		this.itemname = itemname;
		this.categoryfull = categoryfull;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	
	public Item(){}
	
	public String getItem() {
		return itemname;
	}
	
	public String getCategory() {
		return categoryfull;
	}
	
	public String getFromDate() {
		return fromdate;
	}
	
	public String getToDate() {
		return todate;
	}
	
	@Override
	public String toString() {
		return id + " " +  itemname + " " + categoryfull + " " + fromdate + " " + todate;
	}
}
