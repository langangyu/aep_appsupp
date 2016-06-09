 <!--	Common Footer		Validation:		- HTML 4.01 Transitional		Testing:		- IE 5.5		- Netscape 4.72 (Navigation 4.08?)		- Netscape 4.72 w/ stylesheets disabled		-->
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<div id="footer">
<p style="font-size:75%" align="right">
<%= new SimpleDateFormat("MMM dd, yyyy, hh:mma").format(new Date()) %></p>
<hr size="1" width="100%">
<table cellpadding="3" CELLSPACING="0" width="100%">
	<tr>
    <td align="center" class="cgic"> 
    <a href="http://aep.alberta.ca/" title="Alberta Environment and Parks Home" target="_top">Alberta Environment and Parks</a> | 
      <a href="http://aep.alberta.ca/about-us/using-this-site/search.aspx" title="Search" target="_top">Search</a> | 
      <a href="mailto:eds.support@gov.ab.ca" title="Contact Us" target="_top">Contact Us</a> |
      <a href="http://aep.alberta.ca/about-us/using-this-site/privacy/default.aspx" title="Privacy Statement" target="_top">Privacy 
      Statement</a> <br>
    
<!-- Insert site-specific navigation here -->

  The user agrees to the terms and conditions set out in the  
<a href="http://aep.alberta.ca/about-us/using-this-site/copyright-disclaimer.aspx" title="Copyright and Disclaimer" target="_top">Copyright and Disclaimer</a> statement.<br>
        &copy; 1995 - 2012  <a href="http://alberta.ca/" target="_top">Government of Alberta</a></td>
	</tr>
</table>
<!--script>window.onload=my_url();</script-->
</div>