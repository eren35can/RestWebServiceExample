package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity implementation class for Entity: Passenger
 *
 */

@NamedQuery(name = "Passenger.findById", query = "SELECT p FROM Passenger p WHERE p.id = :id")
@Entity
@XmlRootElement
public class Passenger implements Serializable {

	@Transient // makes invisible in database
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}

	@Id // this annotation defines this attribute is primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // generates unique id attribute
	private Integer id;

	private String firstName;
	private String lastName;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Enumerated(EnumType.STRING) // we want to save this attribute as string
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private FlightClass flightClass;

	@ManyToMany(mappedBy = "passengers")
	private List<Flight> flights; // the flight tickets passenger has

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public FlightClass getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(FlightClass flightClass) {
		this.flightClass = flightClass;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", flightClass=" + flightClass + "]";
	}

}
