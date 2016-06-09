<%@page isErrorPage="true" contentType="text/html" %>
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDS</title>
<link rel="stylesheet" type="text/css" href="css/edsGeneral.css" />
<link rel="stylesheet" type="text/css" href="css/edsForm.css" />
<script language="Javascript" src="include/edsFormUtility.js"></script>
</head>
<body>

<jsp:include page="include/edsHeaderWithoutGoaCss.jsp" />
<jsp:include page="include/edsHeader2.jsp" />


<br><br>


<%

String summary = null;
summary = (String) request.getAttribute("summary");	
%>

An error has occurred:<br><br>

<b><%= summary%></b>


<br><br>

<input type="button" id="button" value="&laquo; Correct" onClick="history.back();">&nbsp;&nbsp; 


<jsp:include page="include/edsFooterWithoutGoaCss.jsp" />

</body>
</html>
