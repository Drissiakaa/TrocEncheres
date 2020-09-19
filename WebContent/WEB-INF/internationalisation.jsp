<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Internationalisation des messages</title>
</head>
<body>
<!-- langue par défaut celui du nav + choix langue
test la présence du parametre langue au niveau de la requete utilise EL-->
	<c:if test="${!empty param.langue }">
	<!-- param. dans EL permet d'accèder aux parametre d'une requete -->
	<!-- définition de la local a utiliser -->
	<fmt:setLocale value="${param.langue }"/>
	</c:if>
	
	<p>
	<!--  écrire nos messages et pour commencer définir le fichier ressource a utiliser -->
	<fmt:bundle basename="internationnalisation/mes_messages">
	<fmt:message key="msg_bienvenue"></fmt:message>
	</fmt:bundle>
	
	</p>
	

</body>
</html>