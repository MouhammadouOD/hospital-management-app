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
		
		<title>ACCUEIL</title>
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
		<%@include file="navigationMedecin.jsp" %>	
		<div class="container">
			
						<form action="nouveauMedoc" method="Post" class="was-validated">
						
							<div class="form-group">
    							<label for="nomMed"><b>Nom Medicament:</b></label>
    							<input type="text" class="form-control" id="nomMed" placeholder="Entrez le nom du medicament" name="nomMedoc" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="nombre"><b>Frequence De Prise:</b></label> 
    							<input type="number" class="form-control" id="nombre" placeholder="" name="nombreDefois" required>
    							<div class="form-check-inline">
								  <label class="form-check-label"><b>FOIS PAR</b>
								    <input type="radio" class="form-check-input" name="FrequenceDePrise" value="JOUR">JOUR
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="FrequenceDePrise" value="SEMAINE">SEMAINE
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="FrequenceDePrise" value="MOIS" >MOIS
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="FrequenceDePrise" value="ANNEE">ANNEE
								  </label>
								</div>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

 							<div class="form-group">
    							<label for="nombreParPrise"><b>Nombre Par Prise:</b></label>
    							<input type="number" class="form-control" id="number" name="nombreParPrise" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							

  							<div class="form-group">
    							<label for="nombre2"><b>Duree Prise:</b></label>
    							<input type="number" class="form-control" id="nombre2" name="nombre2" required>
    							<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="dureePrise" value="JOUR">JOUR
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="dureePrise" value="SEMAINE">SEMAINE
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="dureePrise" value="MOIS">MOIS
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="radio" class="form-check-input" name="dureePrise" value="ANNEE">ANNEE
								  </label>
								</div>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="periodePrise"><b>Periode Prise:</b></label>
    							<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="checkbox" class="form-check-input" name="periodePrise" value="MATIN">MATIN
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="checkbox" class="form-check-input" name="periodePrise" value="MIDI">MIDI
								  </label>
								</div>
								<div class="form-check-inline">
								  <label class="form-check-label">
								    <input type="checkbox" class="form-check-input" name="periodePrise" value="SOIR">SOIR
								  </label>
								</div>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							

  							
  							<button type="submit" class="btn btn-primary">Creer</button>
						</form>

					</div>
		

</body>
</html>