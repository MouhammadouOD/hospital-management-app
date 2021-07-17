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
		
		<title>VOIR LES UTILISATEURS</title>
		<style>
			body {
				  background-image: url('./image/accueilAdministrateur.jpeg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>



<%@include file="navigationAdmin.jsp" %>

<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>ID_Utilisateur</th>
        				<th>Pseudo</th>
        				<th>Prenom</th>
        				<th>Nom</th>
        				<th>Mot De Passe</th>
        				<th>Fonction</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>
          				<td>${line.getIdUser()}</td>
          				<td>${line.getPseudo()}</td>
          				<td>${line.getPrenom()}</td>
          				<td>${line.getNom()}</td>
          				<td>${line.getMdp()}</td>
          				<td>${line.getFonction()}</td>
          				<td><button class="btn btn-danger" onclick="window.location.href = 'supprimerUser?id=${line.getIdUser()}';" >SUPPRIMER</button></td>
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>
  				
		

</body>
</html>