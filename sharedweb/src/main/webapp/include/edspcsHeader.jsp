<%@page import="aenvsrd.shared.arch.server.PropertyManager;" %>
<META HTTP-EQUIV='Pragma' CONTENT='no-cache'>
<META HTTP-EQUIV='Cache-Control' CONTENT='no-cache'>

<!-- ** header_v2.inc -->
<!-- $Id: edspcsHeader.jsp,v 1.8 2013/12/12 23:08:34 ehuang Exp $ -->

<script language="Javascript">
function openWindow(n,w,h) {
	 str_url = window.location.href;
	 new_url="help/indexAll.htm";
	 if (str_url.indexOf("/aoacontrol")>0){
		  new_url="AoaReportHelp/index.htm";
	 }
	 if (str_url.indexOf("/econtrol")>0){
	      new_url="help/index.htm";
	 }
	 window.open(new_url,n,'toolbar,width='+w+',height='+h+',scrollbars=yes,resizable=yes,location=no,toolbar=no');
	 return false;
}
</script>

<div id="header"
	style="background: #E6E6E6 url(image/goa/page-bg-top.png) top center no-repeat;
	       position: relative; padding: 40px 0 0; z-index: 1; margin: 0 auto 20px;">		
<table width="100%" cellpadding="0" cellspacing="0" border="0">
  <tr>
    <td valign="bottom" align="left">
      <table cellpadding="0" cellspacing="0" border="0" width="100%" class="cgic">
        <tr>
          <td valign="top">
          <img style="float: left;" align=left src="image/goa/UI/AB-AEP-Web-Logo.png">
          <img style="float: left;" src="image/AER_logo_RGB.png">
            <table cellpadding="5" valign="top" border="0">
             <tr>
                <td valign="bottom" nowrap class="cgic">
                  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="mailto:eds.support@gov.ab.ca" title="Contact Us">Contact Us</a><br>
                  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="http://aep.alberta.ca/forms-maps-services/industry-online-services/electronic-disposition-system/default.aspx" title="EDS Website">EDS Website</a><br>
			<% 
			  // Added for PCS SR2290
			  // Get URL from properties to use as logout hyperlink destination
			  String PCS_LOGOUT_URL_PROPERTY = "pcs.logout.url" ;
			  String logoutURL = PropertyManager.getEDSPropertyValue(PCS_LOGOUT_URL_PROPERTY);
			  // Don't show the logout link if the logoutURL property is not defined 
			  if (logoutURL != null && !logoutURL.equals("")) {
			%>
                  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="<%= logoutURL %>" title="Logout">Logout</a><br>
			<%
			  }
			%>
                  </td> 
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td bgcolor="#eeeeee"><img src="image/spacer.gif" alt width="1" height="3" border="0"></td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</div>

<!-- ** breadcrumb_full_v2.inc -->
<table width="100%" cellpadding="0" cellspacing="0" border="0" bgcolor="#eeeeee">
<tr> 
    <td class="cgic"> 
      <table cellpadding="3" cellspacing="0" border="0">

<tr>
<td class="cgic">&nbsp;<strong>Location:</strong> 
<a href=" http://alberta.ca/" title="Alberta Government" >Alberta Government</a> <strong>&gt;</strong>
<a href="http://aep.alberta.ca/" title="Alberta Environment and Parks">Alberta Environment and Parks</a>&nbsp;&gt;&nbsp;
<script language="Javascript">

	 str_url = window.location.href;

	 if (str_url.indexOf("/pcsa/")>0){
		 document.write("<a href=fileSelection.jsp>");
	 }else{
         document.write("<a href=/pcs/fileSelection.jsp>");
	 }


</script>
Plan Confirmation Service</a> 



<!-- Insert unique breadcrumb here -->
