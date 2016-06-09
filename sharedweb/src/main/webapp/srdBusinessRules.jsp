<%@page import="java.util.List,aenvsrd.shared.arch.servlet.*;" isErrorPage="true" contentType="text/html" %>
<%@ page session="true" %> 

<%

String aTitle = null;

if (session.getAttribute(AbstractSrdRequestHandler.BUS_RULE_TITLE_PARM_NAME) == null) {
    aTitle = "";
} else {
	aTitle = (String)session.getAttribute(AbstractSrdRequestHandler.BUS_RULE_TITLE_PARM_NAME);
}

List aList = (List)session.getAttribute(AbstractSrdRequestHandler.BUS_RULE_LIST_PARM_NAME);

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

<form action="<%=(session.getAttribute("controllerservlet")!=null)?session.getAttribute("controllerservlet"):"referral" %>" method="post">
<input type="hidden" name="requestIdentifier" value="">

<br>

<h2><%=aTitle %></h2>

Your action has been stopped because of the following business rules:

<ul>
<%
for (int x=0;x<aList.size();x++) {
    
    out.println("<li>"+aList.get(x).toString()+"</li>");
}
%>
</ul>

<%
// Minor Maintenance Changes - Switch the order of the '<< Correct' and 'Return to x' Button
//   - Wilson Mok - 11/07/2007

if (session.getAttribute(AbstractSrdRequestHandler.BUS_RULE_HANDLER_PARM_NAME) != null) {
    out.println((String)session.getAttribute(
        AbstractSrdRequestHandler.BUS_RULE_HANDLER_PARM_NAME));
}

out.println("<br>" + (String)session.getAttribute(
	    AbstractSrdRequestHandler.HOME_URL_BUTTON_PARM_NAME));



out.println("<br><br>");

session.setAttribute(AbstractSrdRequestHandler.BUS_RULE_HANDLER_PARM_NAME,null);
session.setAttribute(AbstractSrdRequestHandler.BUS_RULE_LIST_PARM_NAME,null);
session.setAttribute(AbstractSrdRequestHandler.BUS_RULE_TITLE_PARM_NAME,null);

%>

</form>

<jsp:include page="include/edsFooterWithoutGoaCss.jsp" />

</body>
</html>
