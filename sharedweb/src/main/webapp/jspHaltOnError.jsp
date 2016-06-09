<%@page isErrorPage="true" contentType="text/html"  %>
<%@ page session="true" %> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDS: Application for Surface Dispositions</title>
<link rel="stylesheet" type="text/css" href="css/edsGeneral.css" />
<link rel="stylesheet" type="text/css" href="css/edsForm.css" />
<script language="Javascript" src="include/edsFormUtility.js"></script>
</head>
<body>

<jsp:include page="include/edsHeaderWithoutGoaCss.jsp" />
<jsp:include page="include/edsHeader2.jsp" />

<form name="frmError" action="<%=session.getAttribute("controller") %>" method="get">
<input type="hidden" name="control" value="jsperror">
<input type="hidden" name="direction" value="doubleback">

<br><br>


<%
String summary = null;
String details = null;

	if (exception!=null) {
	    out.println(exception.getClass()+"<BR><BR>");
	    out.println(exception.getMessage());
	} else {
	    summary = (String) request.getAttribute("summary");	
		details = request.getAttribute("details") != null ? (String)request.getAttribute("details") : null;
	}
%>

An error has occurred:<br><br>

<H2><%= summary%></H2>
<%
	if (details != null) {
%>	
<BR>
<B>Technical Details: </B> <BR>

<PRE>
<%= details %>
<%	
		}
%>
</PRE>



<input type="hidden" name="errorCurrentStep" value="<%=session.getAttribute("errorCurrentStep") %>">

</form>

<jsp:include page="include/edsFooterWithoutGoaCss.jsp" />

</body>
</html>
