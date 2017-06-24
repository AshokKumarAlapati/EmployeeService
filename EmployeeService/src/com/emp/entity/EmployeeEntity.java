/**
 * 
 */
package com.emp.entity;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Ashok Babu
 *
 */
@XmlType(propOrder = { "id", "name", "doj", "deg" })
public class EmployeeEntity {
	private int id;
	private String name;
	private String doj;
	private String deg;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
	}
	/**
	 * @return the deg
	 */
	public String getDeg() {
		return deg;
	}
	/**
	 * @param deg the deg to set
	 */
	public void setDeg(String deg) {
		this.deg = deg;
	}
	

}
