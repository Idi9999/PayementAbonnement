<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page de Succèss</title>
</head>
<body>


	<div class="container">
		<a href="ControleurServlet">Deconnecter</a> <br></br>
		<h3>Merci pour votre Confiance</h3>
		<h3>Payement Valider</h3>
		<div class="card">
			<div class="card-body">
				<form method="post">
					<label for="avatar">Telecharger votre reçue de payement:</label> <input
						type="file" id="recu" name="recu">
				</form>
			</div>
		</div>
	</div>
</body>
</html>