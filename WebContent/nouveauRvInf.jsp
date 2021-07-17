<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>CREER UN RV</title>
		<style>
			body {
				  background-image: url('./image/infirmierBackground.jpg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<%@include file="navigationInfirmier.jsp" %>
		<div class="container">
			
						<form action="nouveauRvInf" method="post" class="was-validated">
						
							<div class="form-group">
    							<label for="nomPatient">Nom Patient:</label>
    							<input type="text" class="form-control" id="nomPatient" placeholder="nom du patient" name="nomPatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="prenomPatient">Prenom Patient:</label>
    							<input type="text" class="form-control" id="prenomPatient" placeholder="prenom du patient" name="prenomPatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

 							<div class="form-group">
    							<label for="dateRv">Date Du Rendez-Vous:</label>
    							<input type="date" class="form-control" id="dateRv" name="dateRv" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							

  							<div class="form-group">
    							<label for="heureRv">Heure Du Rendez-Vous:</label>
    							<input type="time" class="form-control" id="heureRv" name="heureRv" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							
  							<button type="submit" class="btn btn-primary">Creer</button>
						</form>

					</div>
		
	
</body>
</html>