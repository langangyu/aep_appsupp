
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>

<%
	String summary = (String) request.getAttribute("summary");
	String details = (String) request.getAttribute("details");
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDS: Manage System</title>
<link rel="stylesheet" type="text/css" href="css/edsGeneral.css" />
<link rel="stylesheet" type="text/css" href="css/edsForm.css" />

</head>
<body>

	<jsp:include page="include/edsHeaderWithoutGoaCss.jsp" />

	<jsp:include page="include/edsHeader2.jsp" />

	<font face="Arial">
		<TITLE>Error Occurred!</TITLE>
		<H2>Unexpected System Error Occurred, Please contact System
			Administrator</H2>
		<H2><%=summary%></H2> <%
 	if (details != null) {
 %> <BR> <B>Technical Details: </B> <BR> <PRE>
<%=details%>
<%
	}
%>
</PRE>

	</FONT>
	<jsp:include page="include/edsFooterWithoutGoaCss.jsp" />

</body>
</html>

