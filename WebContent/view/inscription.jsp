<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<p></p>
	
	<div class="container">
		<h1>Remplissez ce formulaire</h1>
		<p></p>
		<form method="post">
			<table>
				<tr>
					<td><label class="control-label">Nom :</label></td>
					<td><input type="text" name="nom" class="form-control" /></td>
				</tr>
				<tr>
					<td><label class="control-label">Prenom :</label></td>
					<td><input type="text" name="prenom" class="form-control" /></td>
				</tr>
				<tr>
					<td><label class="control-label">Email :</label></td>
					<td><input type="email" name="email" class="form-control" /></td>
				</tr>

				<tr>
					<td><label class="control-label">Phone :</label></td>
					<td><input type="tel" name="phone"
						pattern="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$"
						class="form-control" /></td>
				</tr>
				<tr>
					<td><label class="control-label">Mot de passe :</label></td>
					<td><input type="password" name="password"
						class="form-control" /></td>
				</tr>
			</table>
			</b> </b>
			<div>
				<button type="submit" class="btn btn-primary">S'inscrire</button>
			</div>
		</form>
	</div>
</body>
</html>