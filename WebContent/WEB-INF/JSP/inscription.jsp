<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S'inscrire</title>
</head>
<body>
	<form>
		<table>
			<thead>
			<tr>
				<th>Mon profil<th>
			</th>
			</thead>
			
			<tr>
				<td><label for="pseudo">Pseudo :</label></td>
				<td><input type="text" name="pseudo" id="pseudo" required/></td>
				<td><label for="nom">Nom :</label></td>
				<td><input type="text" name="nom" id="nom" required/></td>
			</tr>
			
			<tr>
				<td><label for="prenom">Prénom :</label></td>
				<td><input type="text" name="prenom" id="prenom" required/></td>
				<td><label for="email">Email :</label></td>
				<td><input type="email" name="email" id="email" placeholder="adresse@mail.com" required/></td>
			</tr>
			
			<tr>
				<td><label for="telephone">Téléphone :</label></td>
				<td><input type="text" name="telephone" id="telephone" /></td>
				<td><label for="rue">Rue :</label></td>
				<td><input type="text" name="rue" id="rue" required/></td>
			</tr>
			
			<tr>
				<td><label for="codepostal">Code postal :</label></td>
				<td><input type="text" name="codepostal" id="codepostal" required/></td>
				<td><label for="ville">Ville :</label></td>
				<td><input type="text" name="ville" id="ville" required/></td>
			</tr>
			
			<tr>
			 <td><label for="motdepasse">Mot de passe :</label></td>
   			 <td><input type="password" id="motdepasse" name="motdepasse" required></td>
   			 <td><label for="confirmation">Confirmation :</label></td>
   			 <td><input type="password" id="confirmation" name="confirmation" required></td>             			
			</tr>
			
			<tr>
			<td><input type="submit" value="Créer">
			<!--to do : renseigner url page accueil !-->
			<td><a href="#">Annuler</a>
			</tr>
			
		</table>
		
		
		
	</form>
</body>
</html>