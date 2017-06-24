package com.emp.resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.emp.dao.EmployeeDAO;
import com.emp.entity.Employee;
import com.emp.entity.EmployeeEntity;
import com.emp.entity.EmployeeRequest;
import com.emp.entity.EmployeeResponse;
import com.emp.mapper.EmployeeMapper;

/**
 * @author Ashok Babu
 *
 */
@Path("/EmpRes")
public class EmployeeResource 
{
	EmployeeDAO employeeDAO = new EmployeeDAO();
	EmployeeMapper employeeMapper = new EmployeeMapper();

	@Path("/getEmployee")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getData() throws SQLException {
		List<EmployeeEntity> employeeEntities = employeeMapper.mapResponse(employeeDAO.getEmployees());
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setEmployeeEntities(employeeEntities);
		if(employeeResponse.getEmployeeEntities().size() == 0)
		{
			return Response.status(Status.OK).entity("No employee data found in DB.").build();
		}
		return Response.status(Status.OK).entity(employeeResponse).build();
	}

	@Path("/insertEmployee")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response insertData(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		employeeMapper.mapRequest(employeeRequest, employee);
		try {
			int id = employeeDAO.insertData(employee);
			if (id == 1) {
				return Response.status(Status.OK).entity("Successfully data has been inserted").build();
			} else {
				return Response.status(Status.OK).entity("Unable to insert data. Please try again .").build();
			}
		} catch (SQLException exception) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
		}
	}
	@Path("/deleteEmployee")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public Response deleteEmployee(@QueryParam("id") String id) {
		try {
			int status = employeeDAO.deleteEmployee(Integer.parseInt(id));
			if(status == 1)
			return Response.status(Status.OK).entity("Successfully deleted particular employee record").build();
			else
			return Response.status(Status.OK).entity("No employee record found with provided ID.").build();
		} catch (NumberFormatException | SQLException exception) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
		}

	}
	@Path("/updateEmployee")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
	public Response updateEmployee(EmployeeRequest employeeRequest)
	{
		String message = "";
		Employee employee = new Employee();
		employeeMapper.mapRequest(employeeRequest, employee);
		try {
			int status = employeeDAO.updateEmployee(employee);
			if(status == 1)
			return Response.status(Status.OK).entity("Successfully data has been updated").build();
			else
				return Response.status(Status.OK).entity("Record is not available").build();
		} catch (SQLException e) {
			message = e.getMessage();
		}
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(message).build();
	}
}
