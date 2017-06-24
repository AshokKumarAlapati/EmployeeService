/**
 * 
 */
package com.emp.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ashok Babu
 *
 */
@XmlRootElement(name = "employeeRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeRequest 
{
  @XmlElement(name="employee")
  private EmployeeEntity employeeEntity;

/**
 * @return the employeeEntity
 */
public EmployeeEntity getEmployeeEntity() {
	return employeeEntity;
}

/**
 * @param employeeEntity the employeeEntity to set
 */
public void setEmployeeEntity(EmployeeEntity employeeEntity) {
	this.employeeEntity = employeeEntity;
}
  
}
