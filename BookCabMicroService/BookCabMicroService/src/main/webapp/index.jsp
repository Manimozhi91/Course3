<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>Cab Booking Service</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<br/>
<div class="container bg-dark">

<h2 class="text-light text-center">BOOK CAB</h2>

<div class="card">
</head>
<body> 

   <div class="card-body text-center">

<form method="post" action="bookCab">
<h2 BOOKING CAB></h2>
<label>Name</label>
<input type="text" name="cname"/><br/>
<label>Source</label>
<select name="tolocation">
	<option value="Valacherry">Valacherry</option>
	<option value="Airport">Airport</option>
	<option value="Tambaram">Tambaram</option>
	<option value="Kodambakkam">Kodambakkam</option>
</select></br>
<label>Destination</label>
<select name="fromlocation">
	<option value=" Annanager"> Annanager</option>
	<option value="Tambaram">Tambaram</option>
	<option value="Valacherry">Valacherry</option>
	<option value="Kodambakkam">Kodambakkam</option>
</select>
<br/>
<label>TypeOfCab</label>
<select name="typeofcab">
	<option value="Innova">Innova</option>
	<option value="Nexa">Nexa</option>
	<option value="swift">swift</option>
	<option value="Bolero">Bolero</option>
</select>

<br/>
</br>
<input type="submit" class="btn btn-primary" value="Book Cab"/>
<input type="reset"  class="btn btn-primary" value="Reset"/>
<input type="cancel"  class="btn btn-primary" value="Cancel"/>

</form>
</div>
</body>
</html>