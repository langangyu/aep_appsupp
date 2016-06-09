<%@page import="java.io.PrintWriter,aenvsrd.shared.arch.servlet.*;" isErrorPage="true" contentType="text/html" %>
<%@ page session="true" %> 

<%
Throwable aThrowable = (Throwable)session.getAttribute(AbstractSrdRequestHandler.ERROR_EXCEPTION_PARM_NAME);

String aTitle = null;

if (session.getAttribute(AbstractSrdRequestHandler.ERROR_TITLE_PARM_NAME) == null) {
    aTitle = "";
} else {
	aTitle = (String)session.getAttribute(AbstractSrdRequestHandler.ERROR_TITLE_PARM_NAME);
}

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SRD Error: <%=aTitle %></title>
<link rel="stylesheet" type="text/css" href="css/edsGeneral.css" />
<link rel="stylesheet" type="text/css" href="css/edsForm.css" />
<script language="Javascript" src="include/edsFormUtility.js"></script>
</head>
<body>

<jsp:include page="include/edsHeaderWithoutGoaCss.jsp" />
<jsp:include page="include/edsHeader2.jsp" />

<br>

<h2><%=aTitle %></h2>

<form action="<%=(session.getAttribute("controllerservlet")!=null)?session.getAttribute("controllerservlet"):"referral" %>" method="post">
<input type="hidden" name="requestIdentifier" value="">

<%

out.println("<pre>");

if (session.getAttribute(AbstractSrdRequestHandler.ERROR_MESSAGE_PARM_NAME) != null) {
    out.println((String)session.getAttribute(
        AbstractSrdRequestHandler.ERROR_MESSAGE_PARM_NAME));
}


if (aThrowable != null) {
    out.println("</pre><br>Java Stack Trace:<br><font size=2><pre>");
    aThrowable.printStackTrace(new PrintWriter(out));
}

out.println("</pre></font><br><br>");

if(session.getAttribute(AbstractSrdRequestHandler.HOME_URL_BUTTON_PARM_NAME)!=null) {
out.println((String)session.getAttribute(
    AbstractSrdRequestHandler.HOME_URL_BUTTON_PARM_NAME)+"<br>");
}

if (session.getAttribute(AbstractSrdRequestHandler.ERROR_HANDLER_PARM_NAME) != null) {
    out.println((String)session.getAttribute(
        AbstractSrdRequestHandler.ERROR_HANDLER_PARM_NAME));
}

out.println("<br><br>");

session.setAttribute(AbstractSrdRequestHandler.ERROR_EXCEPTION_PARM_NAME,null);
session.setAttribute(AbstractSrdRequestHandler.ERROR_HANDLER_PARM_NAME,null);
session.setAttribute(AbstractSrdRequestHandler.ERROR_MESSAGE_PARM_NAME,null);
session.setAttribute(AbstractSrdRequestHandler.ERROR_TITLE_PARM_NAME,null);
%>

</form>

<jsp:include page="include/edsFooterWithoutGoaCss.jsp" />

</body>
</html>
