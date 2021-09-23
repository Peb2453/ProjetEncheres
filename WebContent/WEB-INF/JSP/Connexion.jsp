<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <title>Connexion</title>
</head>
<body>
 <div class="formulaireconn">
        <form class="foco" name ="formcon" action="" method="POST"> 
            <label for="connexion"> Connectez-vous</label> <br>
            <input type="text" name="connexion" id="connexion" placeholder="Identifiant" size="30" maxlength="18" autofocus="autofocus" /> 
      <br>      
            <label for="mdp"> Mot de passe</label> <br>
            <input type="password" name="mdp" id="mdp" placeholder="Mot de passe" size="30" maxlength="18" />
        </form>
    </div>


<div class="btco_mem_forgt">
	<div class="btco">
	<input class="BoutonConnexion"
	       type="button"
	       value="Connexion">
	</div>
    <div class="mem_forgt">
	<div class="cb_rmb">
		 <input type="checkbox" id="rememberme" name="rememberme" value="1">
	     <label for="rememberme">Rester connecté</label>
	</div>
    <a class="fgt_psswd" href="fgt_psswd.html">Mot de passe oublié ?</a>   
	</div>
</div>
</body>
</html>