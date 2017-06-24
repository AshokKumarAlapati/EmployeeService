1-->  List of Jar used
		  1)jackson-core-asl-1.9.2.jar
		  2)jackson-jaxrs-1.9.2.jar
		  3)jackson-mapper-asl-1.9.2.jar
		  4)jackson-xc-1.9.2.jar
		  5)jersey-bundle-1.17.1.jar
		  6)jersey-client-1.14.jar
		  7)jersey-core-1.14.jar
		  8)jersey-json-1.14.jar
		  9)jersey-server-1.14.jar
		  10)jersey-servlet-1.14.jar
		  11)jettison-1.1.jar
		  12)jsr311-api-1.1.1.jar
		  13)asm-3.1.jar
		  14)ojdbc6.jar
		  15)EmployeeDAO.jar  (take the source code from EmployeeDB repository and export as jar)
 
2--> CRUD operation URI

		   GET --  http://localhost:8082/EmployeeService/rest/EmpRes/getEmployee
		   POST -- http://localhost:8082/EmployeeService/rest/EmpRes/insertEmployee
		   PUT --  http://localhost:8082/EmployeeService/rest/EmpRes/updateEmployee
		   DELETE -- http://localhost:8082/EmployeeService/rest/EmpRes/deleteEmployee?id=1
 3--> Sample JSON object
 
			 {
				"employee": 
				{
					"id": "1",
					"name": "Ashok",
					"doj": "01021994",
					"deg": "lead engineer"
				}
			}
4--> Table information

         create table employee(id number(5) NOT NULL, name varchar2(25), doj varchar2(10),deg varchar2(25), primary key(id));

