<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<p></p>
	<div class="container">
		<div class="card">
			<div class="card-header">Connecter vous</div>
			<div class="card-body">
				<form  method="post">
					<div class="form-group">
						<label class="control-label">Email :</label> <input type="email"
							name="email" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">Mot de passe:</label> <input
							type="password" name="password" class="form-control" />
					</div>
					<div>
						<button type="submit" class="btn btn-primary">Se
							connecter</button>
					</div>
				</form>
			</div>
		</div>
		<br></br> <br></br>
		
		<p>
			Veuillez cliquer <a href="Inscription">s'incrire</a> si vous etes
			pas encore inscrit
		</p>
	</div>
</body>
</html>