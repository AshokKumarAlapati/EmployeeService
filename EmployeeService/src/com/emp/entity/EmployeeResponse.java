/**
 * 
 */
package com.emp.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ashok Babu
 *
 */
@XmlRootElement(name = "employeeResponse")
@XmlAccessorType (XmlAccessType.FIELD)
public class EmployeeResponse 
{
  @XmlElement(name="employee")
  private List<EmployeeEntity> employeeEntities;

/**
 * @return the employeeEntities
 */
public List<EmployeeEntity> getEmployeeEntities() {
	return employeeEntities;
}

/**
 * @param employeeEntities the employeeEntities to set
 */
public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
	this.employeeEntities = employeeEntities;
}
}
