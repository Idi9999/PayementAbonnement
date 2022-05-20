<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
		
	<p></p>
	<p></p>
	<p></p>

	<div class="container">
	
	<h1>Bienvenu dans votre page</h1>
		<div class="card">
			<div class="card-header">Listes des utilisateurs</div>
			<div class="card-body">
				<table class="table table-striped">
					<tr>
						<th>ID</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Role</th>
						<th>Suppression</th>
						<th>Edition</th>
					</tr>
					<c:forEach items="${model.users}" var="p">
						<tr>
							<td>${p.id }</td>
							<td>${p.nom }</td>
							<td>${p.prenom }</td>
							<td>${p.email }</td>
							<td>${p.phone }</td>
							<td>${p.role.role }</td>
							<td><a onclick="return confirm('Etes-vous sûr ?')"
								href="supprimer.do?id=${p.id }">Supprimer</a></td>
							<td><a href="editer.do?id=${p.id }">Edit</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

</body>
</html>