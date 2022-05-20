<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="java.io.*,java.util.*, javax.servlet.* ,java.text.SimpleDateFormat"%>
<%
Date date = new Date();
String dat = new SimpleDateFormat("dd/MM/yyyy").format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<br></br>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<h1>Paiement de facture en ligne</h1>
				<h4>Mr/Mme : ${user.nom } ${user.prenom }</h4>
				<h4>Numero : ${user.phone }</h4>
				<h4>Montant : 300dh</h4>
				<form "" method="post">
					<div class="form-group">
						<label class="control-label">Numero de Carte :</label> <input
							type="text"  name="numcarte"
							class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">Date d'Expiration :</label> <input
							type="date" name="dateExp" min="<%=dat%>" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">Trois dernier chiffres :</label> <input
							type="text" name="dernierChf" class="form-control" />
					</div>

					<div>
						<button type="submit" class="btn btn-primary">Valider</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>