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
		
		<title>AFFICHER-CONSUTATION</title>
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
		
		
		<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				
        				<th>PerimCranien</th>
        				<th>PerimBracial</th>
        				<th>PerimThoracique</th>
        				<th>SegmentInf</th>
        				<th>SegmentSup</th>
        				<th>FreqCardiaque</th>
        				<th>FreqThoracique</th>
        				<th>Patient</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${consultations}" var="line">
      					<tr>
          			
          				
          				<td>${line.getPerimCranien()}</td>
          				<td>${line.getPerimBracial()}</td>
          				<td>${line.getPerimThoracique()}</td>
          				<td>${line.getSegmentInf()}</td>
          				<td>${line.getSegmentSup()}</td>
          				<td>${line.getFreqCardiaque()}</td>
          				<td>${line.getFreqThoracique()}</td>
          				<td>${line.getPatient()}</td>
          
          				
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
		</div>
		
</body>
</html>