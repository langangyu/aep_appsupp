<META HTTP-EQUIV='Pragma' CONTENT='no-cache'>
<META HTTP-EQUIV='Cache-Control' CONTENT='no-cache'>
<!-- $Id: edsFncHeader.jsp,v 1.6 2013/11/12 20:15:52 asharobi Exp $ -->
<!-- ** header_v2.inc -->

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
//function my_url(){
//   alert('window.location.href='+window.location.href+' and entrypoint='+'<%out.print((String)session.getAttribute("entrypoint"));%>'+ and getNavToRoot()='+getNavToRoot());
//}
  function getNavToRoot() {
	str_url = window.location.href;
	rtn = "/eds";
 	if (str_url.indexOf("/edsa/")>0)
		rtn = "/edsa";
	else if (str_url.indexOf("/edsd/")>0)
		rtn = "/edsd";
	else if (str_url.indexOf("/edsd2/")>0)
		rtn = "/edsd2";
	else if (str_url.indexOf("/edst/")>0)
		rtn = "/edst";
		
	return rtn;
  }
</script>

<table width="100%" bgcolor="#ffffff" cellpadding="0" cellspacing="0" border="0">
  <tr>
    <td valign="bottom" align="left">
      <table cellpadding="0" cellspacing="0" border="0" width="100%" class="cgic">
        <tr>
          <td height="71" valign="top">
          <img align=left src="image/eds_banner.jpg">
            <table cellpadding="5"  align="left" border="0">
             <tr>
                <td valign="bottom" nowrap class="cgic"><img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="mailto:eds.support@gov.ab.ca" title="Contact Us">Contact Us</a><br>
                  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="http://aep.alberta.ca/forms-maps-services/industry-online-services/electronic-disposition-system/default.aspx" title="EDS Website">EDS Website</a><br>
                  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">                 
                  <a href='#' onClick="return openWindow('onlinehelp',800,500);" title="Help">Help</a><br>
		
				  <img src="image/blue_arrow.gif" alt border="0" WIDTH="5" HEIGHT="9">
                  <a href="sharedmaint?handlerValue=Logout">Logout</a>
                  </td> 
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td bgcolor="#003399"><img src="image/spacer_blue.gif" alt width="505" height="1" border="0"></td>
        </tr>
        <tr>
          <td bgcolor="#eeeeee"><img src="image/spacer.gif" alt width="1" height="3" border="0"></td>
        </tr>
      </table>
    </td>
    <td valign="bottom" align="left" width="2%">
      <table width="95" cellpadding="0" cellspacing="0" border="0">
        <tr>
          <td align="right"><a href="http://www.gov.ab.ca"><img src="image/signature.gif" width="95" height="44" alt="Government of Alberta" border="0" vspace="4"></a></td>
        </tr>
        <tr>
          <td><img src="image/spacer_blue.gif" alt="spacer" height="4" width="95" border="0"></td>
        </tr>
      </table>
    </td>
  </tr>
</table>

<!-- ** breadcrumb_full_v2.inc -->
<table width="100%" cellpadding="0" cellspacing="0" border="0" bgcolor="#eeeeee">
<tr> 
    <td class="cgic"> 
      <table cellpadding="3" cellspacing="0" border="0">

<tr>
<td class="cgic">&nbsp;<strong>Location:</strong> 
<a href=" http://alberta.ca/" title="Alberta Government" >Alberta Government</a> <strong>&gt;</strong> <a href="http://aep.alberta.ca/" title="Alberta Environment and Parks">Alberta Environment and Parks</a>&nbsp;&gt;&nbsp;


<!-- Insert unique breadcrumb here -->
