package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */

@NamedQuery(name = "Flight.findById", query = "SELECT f FROM Flight f WHERE f.id = :id")
@Entity
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private FlightDestinations flightOrigin;

	@Enumerated(EnumType.STRING)
	private FlightDestinations flightDestination;

	private Integer price;

	@Temporal(TemporalType.TIMESTAMP)
	private Date flightTime;

	// airplane object is created and remove automatically thanks to cascade operation
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "airplane_fk")
	private Airplane airplaneDetail;

	// flights and passengers joint table : f_p_join (arbitrary)
	@ManyToMany
	@JoinTable(name = "f_p_join", joinColumns = @JoinColumn(name = "flight_fk"), inverseJoinColumns = @JoinColumn(name = "passenger_fk"))
	private List<Passenger> passengers;

	
	@OneToMany(mappedBy = "fligthForPilot", cascade = {CascadeType.REMOVE})
	private List<Pilot> pilots;

	public Airplane getAirplaneDetail() {
		return airplaneDetail;
	}

	public void setAirplaneDetail(Airplane airplaneDetail) {
		this.airplaneDetail = airplaneDetail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FlightDestinations getFlightOrigin() {
		return flightOrigin;
	}

	public void setFlightOrigin(FlightDestinations flightOrigin) {
		this.flightOrigin = flightOrigin;
	}

	public FlightDestinations getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(FlightDestinations flightDestination) {
		this.flightDestination = flightDestination;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Flight [pilots=" + pilots + ", id=" + id + ", flightOrigin=" + flightOrigin + ", flightDestination="
				+ flightDestination + ", price=" + price + ", flightTime=" + flightTime + ", airplaneDetail="
				+ airplaneDetail + "]";
	}

}
