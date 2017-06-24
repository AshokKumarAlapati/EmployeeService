/**
 * 
 */
package com.emp.mapper;

import java.util.ArrayList;
import java.util.List;

import com.emp.entity.Employee;
import com.emp.entity.EmployeeEntity;
import com.emp.entity.EmployeeRequest;

/**
 * @author Ashok Babu
 *
 */
public class EmployeeMapper 
{
  public Employee mapRequest(EmployeeRequest sourceObj, Employee targetObj)
  {
	  EmployeeEntity employeeEntity = sourceObj.getEmployeeEntity();
	  targetObj.setDeg(employeeEntity.getDeg());
	  targetObj.setDoj(employeeEntity.getDoj());
	  targetObj.setId(employeeEntity.getId());
	  targetObj.setName(employeeEntity.getName());
	  return targetObj;
  }
  public List<EmployeeEntity> mapResponse(List<Employee> employees)
  {
	  List<EmployeeEntity> employeeEntities = new ArrayList<>();
	  
	  for(Employee employee : employees)
	  {
		  EmployeeEntity employeeEntity = new EmployeeEntity();
		  employeeEntity.setId(employee.getId());
		  employeeEntity.setName(employee.getName());
		  employeeEntity.setDoj(employee.getDoj());
		  employeeEntity.setDeg(employee.getDeg());
		  employeeEntities.add(employeeEntity);
	  }
	  return employeeEntities;
  }
}
