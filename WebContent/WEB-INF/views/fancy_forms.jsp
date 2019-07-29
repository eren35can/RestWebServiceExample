<!DOCTYPE html>
<html>
<head>
	<style>
		body{
			font-family: arial, sans-herif;
			fon-size 14px;
		}
	</style>
</head>

<body>
	<h1 style="text-decoration: underline;">Fancy Forms</h1>
	<h1>Add flight and airplane</h1>
	
	<form method="POST" action="AddFlight">
		From:
		<select name="from_destination">
		
			<option value="SanFrancisco">San Francisco</option>
			<option value="LosAngeles">Los Angeles</option>
			<option value="NewYork">New York</option>
			<option value="London">London</option>
			<option value="Paris">Paris</option>
			<option value="Rome">Rome</option>
			<option value="Amsterdam">Amsterdam</option>
			
		</select>
		
		<br /><br />
		
		To:
		<select name="to_destination">
		
			<option value="SanFrancisco">San Francisco</option>
			<option value="LosAngeles">Los Angeles</option>
			<option value="NewYork">New York</option>
			<option value="London">London</option>
			<option value="Paris">Paris</option>
			<option value="Rome">Rome</option>
			<option value="Amsterdam">Amsterdam</option>
			
		</select>
		
		<h4>Time of Flight:</h4>
		
		<hr />
		Year:
		<select name="year">
		
			<option value="2019">2019</option>
			<option value="2020">2020</option>
			<option value="2021">2021</option>
			<option value="2022">2022</option>
			<option value="2023">2023</option>
			<option value="2024">2024</option>
			<option value="2025">2025</option>
			
		</select>
		
		<br /><br />
		
		Month:
		<select name="month">
		
			<option value="0">January</option>
			<option value="1">February</option>
			<option value="2">March</option>
			<option value="3">April</option>
			<option value="4">May</option>
			<option value="5">June</option>
			<option value="6">July</option>
			<option value="7">August</option>
			<option value="8">September</option>
			<option value="9">October</option>
			<option value="10">November</option>
			<option value="11">December</option>
			
		</select>		
		<br /><br />
		
		Day of Month:
		<input name="day" type="text"></input>
		<br /><br />
		Hour of Day (0-23):
		<input name="hour" type="text"></input>
		<br /><br />
		Minute (0-59):
		<input name="minute" type="text"></input>
		<br /><br />
		
		Price:
		<input name="price" type="text"></input>
		<hr />
		
		
		<h4>Airplane:</h4>
		
		Plane Make:
		<input name="airplane_make" type="text"></input>
		<hr />
		
		Model Name:
		<input name="airplane_model" type="text"></input>
		<hr />
		
		Seating:
		<input name="airplane_seating" type="text"></input>
		<hr />
		<button type="submit">Add flight and airplane</button>
		<hr />
		
	</form>
	
	<h1>Add pilot to flight</h1>
	
	<form method="POST" action="CreatePilotAndAddToFlight">
	
		First Name:
		<input name="first_name" type="text"></input>
		
		<br /><br />
		Last Name:
		<input name="last_name" type="text"></input>
		
		<br /><br />
		License Number:
		<input name="license" type="text"></input>
		
		<br /><br />
		Pilot Rank:
		<select name="pilot_rank">
		
			<option value="Captain">Captain</option>
			<option value="FirstOfficer">First Officer</option>
			<option value="JuniorOfficer">Junior Officer</option>
			
		</select>
		<br /><br />
		
		Flight ID:
		<input name="flightID" type="text"></input>
		<hr />
		<button type="submit">Add pilot to flight</button>
		<hr />
		
	</form>
	<h1>Add passenger</h1>
	
	<form method="POST" action="AddPassenger">
	
		First Name:
		<input name="first_name" type="text"></input>
		<br /><br />
		
		Last Name:
		<input name="last_name" type="text"></input>
		<br /><br />
		
		Date of Birth:
		<input name="dob" type="text"></input>
		<br /><br />
		
		Gender:
		<select name="gender">
		
			<option value="Male">Male</option>
			<option value="Female">Female</option>
			
		</select>
		<br /><br />
		
		Flight Class:
		<select name="flight_class">
			<option value="First">First</option>
			<option value="Business">Business</option>
			<option value="Coach">Coach</option>
		</select>
		<hr />
		<button type="submit">Add passenger</button>
		<hr />
		
	</form>
	
	<h1>Add passenger to flight</h1>
	<form method="POST" action="AddPassengerToFlight">
	
		Add a passenger with an id of
		<input name="passengerID" type="text"></input>
		
		to a flight with an id of
		<input name="flightID" type="text"></input>
		
		<hr />
		<button type="submit">Add passenger to flight</button>
		<hr />
		
	</form>
	<h1>Add flight to passenger <span style="font-size: 16px; vertical-align:middle;">(give a 
	passenger another fight ticket to his/her collection of flight tickets)</span></h1>
	
	<form method="POST" action="AddFlightTicketToPassenger">
	
		Add a ticket for a flight with and ID of
		<input name="flightID" type="text"></input>
		
		to a passenger with and ID of
		<input name="passengerID" type="text"></input>
		<br /><br />
		
		<span style="font-weight: bold;">(In real world terms - add the flight ticket to the 
		passenger's collection of flight tickets)</span>
		
		<hr />
		<button type="submit">Add flight (ticket) to passenger's flight tickets</button>
		<hr />
		
	</form>
</body>
</html>