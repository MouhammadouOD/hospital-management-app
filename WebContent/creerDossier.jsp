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
				  background-image: url('./image/medecinBackground2.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>
		<%@include file="navigationMedecin.jsp" %>
		<div class="container col-sm-9">
		<form action="creerDossier" method="post" class="was-validated">
							<div class="form-group">
    							<label for="division">Division:</label>
    							<input type="text" class="form-control" id="division" placeholder="donner la division" name="division" >
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
				
						<div class="form-group">
    							<label for="dateEntree">Date Entree:</label>
    							<input type="datetime-local" class="form-control" id="dateEntree" placeholder="" name="dateEntree" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
						
						<div class="form-group">
    							<label for="dateSortie">Date Sortie:</label>
    							<input type="datetime-local" class="form-control" id="dateSortie" placeholder="" name="dateSortie">
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
						
						
							
  							<div class="form-group">
    							<label for="diagnosticEntree">Diagnostic Entree:</label>
    							<input type="text" class="form-control" id="diagnosticEntree" placeholder=""  name="diagEntree" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="diagnosticSortie">Diagnostic Sortie:</label>
    							<input type="text" class="form-control" id="diagnosticSortie" placeholder=""  name="diagSortie">
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

 							<div class="form-group">
    							<label for="imc">Imc:</label>
    							<input type="number" class="form-control" id="imc" placeholder="" name="imc" >
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="pc">Pc:</label>
    							<input type="number" class="form-control" id="pc" placeholder="" name="pc" >
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="pb">Pb:</label>
    							<input type="number" class="form-control" id="pb" placeholder="" name="pb" >
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="argAnamnestiques">Arguments Anamnestiques:</label><br>
    							<textarea id="argAnamnestiques" name="argAnamnestiques" rows="4" cols="100">
    							</textarea>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>


  							<div class="form-group">
    							<label for="argCliniques">Arguments Clinique:</label><br>
    							<textarea id="argCliniques" name="argCliniques" rows="4" cols="100">
    							</textarea>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="traitement">Traitement:</label>
    							<input type="text" class="form-control" id="taille" placeholder=""  name="traitement" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="evolution">Evolution:</label>
    							<input type="text" class="form-control" id="evolution" placeholder=""  name="evolution" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<button type="submit" class="btn btn-primary">valider</button>
						</form>
				</div>

</body>
</html>