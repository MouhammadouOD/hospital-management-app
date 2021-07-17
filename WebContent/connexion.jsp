<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				  background-image: url('./image/pageConnexion.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>


	<body>

		<div class="container">

			<div class="row">

				<div class="container col-sm-4">
					<img src="./image/imagehosto.jpg" class=" img-responsive max-width: 100%; , height: auto; and display: block;" width="200">
				</div>
				<div class="container col-sm-8 shadow-lg p-4 mb-4 bg-info text-white" style="background: ">

					<h1 >BIENVENUE</h1>
					<p>La plateforme de gestion de <font size="4" class="font-weight-bold text-dark">l'HOPITAL REGIONAL DE OUROSSOGUI</font> et du suivi des patients.</p>
					<p>Pour vous connecter entrer votre nom d'utilisateur et votre mot de passe.</p>

					<h1 class="font-weight-bold text-dark">CONNEXION</h1>

					<!--FORMULAIRE DE CONNEXION -->

					<form method="post" action="${pageRedirige}" class="was-validated">

 						<div class="form-group">
    						<label for="pseudo">Pseudo:</label>
    						<input type="text" class="form-control" id="pseudo"  name="txtPseudo" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">Please fill out this field.</div>
  						</div>

  						<div class="form-group">
    						<label for="mdp">Mot de Passe:</label>
    						<input type="password" class="form-control" id="mdp" placeholder="Entrer le mot de passe" name="txtMdp" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">Please fill out this field.</div>
  						</div>
  						
  						<button type="submit" class="btn btn-primary">Se connecter</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
