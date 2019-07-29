package com.airline.controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.models.FlightClass;
import com.airline.models.Gender;
import com.airline.models.Passenger;
import com.airline.service.PassengerService;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	PassengerService ps;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPassenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fName = request.getParameter("first_name");
		String lName = request.getParameter("last_name");		
		String dobRaw = request.getParameter("dob"); //1/7/2019
		String gender = request.getParameter("gender");
		String flightClass = request.getParameter("flight_class");
		
		Passenger p = new Passenger();
		
		p.setFirstName(fName);
		p.setLastName(lName);
		
		String[] dobArr = dobRaw.split("\\/");
		
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, Integer.parseInt(dobArr[2]));
		cal.set(Calendar.MONTH,  Integer.parseInt(dobArr[1]) -1 );
		cal.set(Calendar.DAY_OF_MONTH,  Integer.parseInt(dobArr[0]));
		Date dob = cal.getTime();

		p.setDob(dob);
		p.setGender(Gender.valueOf(gender));
		p.setFlightClass(FlightClass.valueOf(flightClass));
		
		ps.addPassenger(p);
		
		response.sendRedirect("Passengers");
		
		
	}

}
