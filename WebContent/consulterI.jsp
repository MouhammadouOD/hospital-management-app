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
		
		<title>DOSSIER-PATIENT</title>
		<style>
			body {
				  background-image: url('./image/infirmierBackground.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<%@include file="navigationInfirmier.jsp" %>
		
	<div class="container">
			
						<form action="consulterI" method="post" class="was-validated">
						
							
  							<div class="form-group">
    							<label for="heure">Date et Heure:</label>
    							<input type="datetime-local" class="form-control" id="heure" placeholder=""  name="heure" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

 							<div class="form-group">
    							<label for="poids">Poids:</label>
    							<input type="number" class="form-control" id="poids" placeholder="donner le poids" name="poids" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="temperature">Température:</label>
    							<input type="number" class="form-control" id="temperature" placeholder="donner la temperature" name="temperature" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>


  							<div class="form-group">
    							<label for="taille">Taille:</label>
    							<input type="number" class="form-control" id="taille" placeholder="donner la taille"  name="taille" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							
  							<button type="submit" class="btn btn-primary">valider</button>
						</form>

					</div>

</body>
</html>