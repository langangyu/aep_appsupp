<META HTTP-EQUIV='Pragma' CONTENT='no-cache'>
<META HTTP-EQUIV='Cache-Control' CONTENT='no-cache'>
<!-- $Id: edsHeader.jsp,v 1.31 2014/01/15 18:39:41 pisop Exp $ -->
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

		<title>Alberta Environment and Parks (AEP)</title>
		<!--link id="cssLink1" href="http://aep.alberta.ca/css/oocss/reset.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="Link2" href="http://aep.alberta.ca/css/SiteSpecific.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink2" href="http://aep.alberta.ca/css/oocss/common.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink3" href="http://aep.alberta.ca/css/oocss/layout.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink4"	href="http://aep.alberta.ca/css/oocss/container.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink5"	href="http://aep.alberta.ca/css/oocss/content.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink6" href="http://aep.alberta.ca/css/oocss/skin.css"
			media="screen, projection" rel="stylesheet" type="text/css" />
		<link id="cssLink7"	href="http://aep.alberta.ca/css/oocss/modules.css"
			media="screen, projection" rel="stylesheet" type="text/css" /-->
		
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/reset.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/SiteSpecific.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/common.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/layout.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/container.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/content.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/skin.css"/>
		<link rel="stylesheet" type="text/css" href="css/goa/oocss/modules.css"/>
		
		<link rel="stylesheet" type="text/css" href="css/edsHeader.css"/>
		<link rel="stylesheet" type="text/css" href="css/edsGeneral.css"/>
		<link rel="stylesheet" type="text/css" href="css/edsForm.css"/>

		<!-- #page -->
		<div id="page">
			<div id="header">
				<div class="inner" style="width: 1150px;">
					<div id="header-logo">
						<a href="http://aep.alberta.ca/index.html" id="header-logo-link">Alberta Environment and Parks</a>
					</div>
					<div id="header-logoAER">
					</div>
					<div id="nav"></div>
					<div id="header-top">
						<h2 class="visuallyhidden">Government of Alberta links</h2>
						<ul id="goa-links" class="clearfix">
							<li class="header-item first"><a href="http://alberta.ca/"
								class="header-link">Government of Alberta Home</a></li>
							<li class="header-item"><a
								href="http://aep.alberta.ca/about-us/using-this-site/Default.aspx"
								class="header-link">Using This Site</a></li>
							<li class="header-item"><a
								href="http://www.programs.alberta.ca/" class="header-link">Services</a></li>
							<li class="header-item last"><a
								href="http://aep.alberta.ca/about-us/contact-us/default.aspx"
								class="header-link">Contact Us</a></li>
						</ul>
						<ul id="ministry-links">
							<li class="header-item"><a 
								href="mailto:eds.support@gov.ab.ca" title="Contact Us"
								class="header-link">Contact Us</a></li>
							<li class="header-item"><a 
								href="http://aep.alberta.ca/forms-maps-services/industry-online-services/electronic-disposition-system/default.aspx" title="EDS Website"
								class="header-link">EDS Website</a></li>
							<li class="header-item"><a 
								href='#' onClick="return openWindow('onlinehelp',800,500);" title="Help"
								class="header-link">Help</a></li>
							<li class="header-item"><a 
								href="sharedmaint?handlerValue=Logout"
								class="header-link">Logout</a></li>
								
							<li class="header-item last"><a
								href="http://aep.alberta.ca/about-us/using-this-site/search.aspx"
								class="header-link">Search Environment</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		
<!-- ** breadcrumb_full_v2.inc -->
<table width="100%" cellpadding="0" cellspacing="0" border="0" bgcolor="#eeeeee" style="margin-top:30px">
<tr> 
    <td class="cgic"> 
      <table cellpadding="3" cellspacing="0" border="0">
<tr>
<td class="cgic">&nbsp;<strong>Location:</strong> 
<a href=" http://alberta.ca/" title="Alberta Government" >Alberta Government</a> <strong>&gt;</strong> <a href="http://aep.alberta.ca/" title="Alberta Environment and Parks">Alberta Environment and Parks</a>&nbsp;&gt;&nbsp;<a href=" " onClick="if (confirm('Cancel and return to the main menu?')) location.href=getNavToRoot();" title="Electronic Disposition System">Electronic Disposition System</a>


<!-- Insert unique breadcrumb here -->
