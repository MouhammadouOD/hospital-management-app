<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>NOUVEAU PATIENT</title>
		<style>
			body {
				  background-image: url('./image/medecinBackground2.jpg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>

	<%@ include file="navigationMedecin.jsp" %>
	
	<!-- PAGE INSCRIPTION---------------------------------------- -->


  					<div class="container">
			
						<form method="post" action="nouveauPatientM" class="was-validated">

 							<div class="form-group">
    							<label for="nomPatient">NOM:</label>
    							<input type="text" class="form-control" id="nomPatient" placeholder="Entrer le nom" name="nomPatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="prenomPatient">Prenom:</label>
    							<input type="text" class="form-control" id="prenomPatient" placeholder="Entrer le prenom" name="prenomPatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="sexePatient">Sexe du patient:</label>
    							<select class="form-control" id="sexePatient" name="sexePatient">
    								<option>M</option>
							        <option>F</option>
							    </select>
  							</div>

  							<div class="form-group">
    							<label for="dateNaissPatient">Date De Naissance:</label>
    							<input type="date" class="form-control" id="dateNaissPatient" name="dateNaissPatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="adressePatient">Adresse:</label>
    							<input type="text" class="form-control" id="adressePatient" placeholder="Entrer son adresse" name="adressePatient" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="nomAccompagnant">Nom Accompagnant:</label>
    							<input type="text" class="form-control" id="nomAccompagnant" placeholder="Entrer le nom de l'Accompagnant" name="nomAccompagnant" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="numAccompagnant">Numero tel de l'accompagnant:</label>
    							<input type="tel" class="form-control" id="numAccompagnant" name="numAccompagnant" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>


  							<button type="submit" class="btn btn-primary">Inscrire</button>
						</form>

					</div>

  			
	
</body>
</html>