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
		
		<div class="container">
			
						<form action="consulterM" method="post" class="was-validated">

 							<div class="form-group">
    							<label for="perimetreCranien">P�rim�tre Cranien:</label>
    							<input type="text" class="form-control" id="perimetreCranien" placeholder="perimetre Cranien" name="perimetreCranien" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>

  							<div class="form-group">
    							<label for="perimetreBracial">P�rim�tre Bracial:</label>
    							<input type="text" class="form-control" id="perimetreBracial" placeholder="perimetre Bracial" name="perimetreBracial" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>


  							<div class="form-group">
    							<label for="perimetreThoracique">P�rim�tre Thoracique:</label>
    							<input type="text" class="form-control" id="perimetreThoracique" placeholder="perimetre Thoracique" name="perimetreThoracique" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="segmentInf�rieur">Segment Inf�rieur:</label>
    							<input type="text" class="form-control" id="segmentInf�rieur" placeholder="segment inf�rieur" name="segmentInf�rieur" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="segmentSuperieur">Segment superieur:</label>
    							<input type="text" class="form-control" id="segmentSuperieur" placeholder="segment superieur" name="segmentSuperieur" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="frequenceCardiaque">Fr�quence cardiaque:</label>
    							<input type="text" class="form-control" id="frequenceCardiaque" placeholder="frequence cardiaque" name="frequenceCardiaque" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							<div class="form-group">
    							<label for="frequenceThoracique">Fr�quence Thoracique:</label>
    							<input type="text" class="form-control" id="frequenceThoracique" placeholder="frequence thoracique" name="frequenceThoracique" required>
    							<div class="valid-feedback">Valid.</div>
    							<div class="invalid-feedback">Please fill out this field.</div>
  							</div>
  							
  							
  							<button type="submit" class="btn btn-primary">Valider</button>
						</form>

					</div>

</body>
</html>