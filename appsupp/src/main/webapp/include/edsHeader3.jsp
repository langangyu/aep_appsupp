<META HTTP-EQUIV='Pragma' CONTENT='no-cache'>
<META HTTP-EQUIV='Cache-Control' CONTENT='no-cache'>
<%
//jni 28June2010 add header for jsp page
if(session.getAttribute("processTypeTitle") != null && session.getAttribute("processTypeTitle").equals("Application")){
	out.println("<h3>Application</h3><br>");
}
else if(session.getAttribute("processTypeTitle") != null && session.getAttribute("processTypeTitle").equals("Amendment")){
	out.println("<h3>Amendment</h3><br>");
}
else if(session.getAttribute("processTypeTitle") != null && session.getAttribute("processTypeTitle").equals("EnhancedApplication")){
	out.println("<h3>Enhanced Approval Process - Application</h3><br>");
}
else if(session.getAttribute("processTypeTitle") != null && session.getAttribute("processTypeTitle").equals("EnhancedAmendment")){
	out.println("<h3>Enhanced Approval Process - Amendment</h3><br>");
}
else if(session.getAttribute("processTypeTitle") != null && session.getAttribute("processTypeTitle").equals("EnhancedFinalSubmission")){
	out.println("<h3>Enhanced Approval Process - Final Submission</h3><br>");
}
%>
