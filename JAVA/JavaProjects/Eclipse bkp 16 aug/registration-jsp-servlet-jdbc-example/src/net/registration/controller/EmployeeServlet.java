package net.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.registration.dao.EmployeeDao;
import net.registration.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	//Firstly creating an Employee Dao class object here
	
	EmployeeDao employeeDao =new EmployeeDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
	dispatcher.forward(request, response);
	}
	// the req is forwarded to the corresponding jsp page as above..

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// WHENEVER WE SUBMIT THE FORM doPost will be executed in the servlet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//REmoved the extra code which existed..
		
//		Giving the req params here
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String username= request.getParameter("username");
		String contact= request.getParameter("contact");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		

		//setting the already given code 
	Employee employee = new Employee();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	employee.setAddress(address);
	employee.setContact(contact);
	employee.setPassword(password);
	employee.setUsername(username);
	
	
	try {
		employeeDao.registerEmployee(employee);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
	dispatcher.forward(request, response);
//	response.sendRedirect(""); NOT required
	//now the model controller and the dao are done lets give the view layer 
//	https://youtu.be/DzYyzmP4m5c?t=1078
		
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
