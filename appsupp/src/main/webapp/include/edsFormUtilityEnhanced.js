	function go_focus(control) {
		control.focus()
		control.value="";
		control.select();
	}

	function sec_onChange(control) {
		if (isNaN(control.value)) {
			alert("This value must be numeric.");
			go_focus(control);
			return false;
		}
		if ((parseInt(control.value)<1)||(parseInt(control.value)>36)) {
			alert("Value out of range (1-36).");
			go_focus(control);
			return false;
		}
		return true;
	}

	function twp_onChange(control) {
		if (isNaN(control.value)) {
			alert("This value must be numeric.");
			go_focus(control);
			return false;
		}
		if ((parseInt(control.value)<1)||(parseInt(control.value)>126)) {
			alert("Value out of range (1-126).");
			go_focus(control);
			return false;
		}
		return true;
	}

	function rge_onChange(control) {
		if (isNaN(control.value)) {
			alert("This value must be numeric.");
			go_focus(control);
			return false;
		}
		if ((parseInt(control.value)<1)||(parseInt(control.value)>30)) {
			alert("Value out of range (1-30).");
			go_focus(control);
			return false;
		}
		return true;
	}

	function mer_onChange(control) {
		if (isNaN(control.value)) {
			alert("This value must be numeric.");
			go_focus(control);
			return false;
		}
		if ((parseInt(control.value)<1)||(parseInt(control.value)>4)) {
			alert("Value out of range (1-4).");
			go_focus(control);
			return false;
		}
		return true;
	}


	function landAddRowFrm() {
		var frm = document.forms[0];
		var y=0;
		var allfull=true;
		
		if ((allfull)&&(submitValidation())) {
			frm.hidLrc.value=parseInt(frm.hidLrc.value)+1;
			frm.noforward.value="true";
			frm.direction.value="next";
			frm.submit();
		}
		
	}

	function landRemRowFrm(row) {
		var frm = document.forms[0];
		if (confirm("Are you sure you want to remove this row?")) {
			frm.hidRemWhich.value="land";
			frm.hidRemRow.value=row-1;
			frm.noforward.value="true";
			frm.direction.value="next";
			if (submitValidation()) {
				frm.submit();
			}
		}
	}

	function atsAddRowFrm() {
		var frm = document.forms[0];
		var y=0;
		var allfull=true;
		
		if ((allfull)&&(submitValidation())) {
			frm.hidAtsc.value=parseInt(frm.hidAtsc.value)+1;
			frm.noforward.value="true";
			frm.direction.value="next";
			frm.submit();
		}

	}

	function atsRemRowFrm(row) {
		var frm = document.forms[0];
		if (confirm("Are you sure you want to remove this row?")) {
			frm.hidRemWhich.value="ats";
			frm.hidRemRow.value=row-1;
			frm.noforward.value="true";
			frm.direction.value="next";
			if (submitValidation()) {
				frm.submit();
			}
		}
	}
	
	function validatePhoneNum(str) {
		var r=false;
		
		if (str.length==13) {
			if ((str.charAt(0)=='(')&&(str.charAt(4)==')')&&(str.charAt(8)=='-'))
				r=true;
		}
		return r;	
	}

	function validationPopup(txt) {
		w = window.open("", "edsValidationPopup",'toolbar=no,status=no,directories=no,location=no,menubar=no,scrollbars=yes,titlebar=no,width=350,height=250')
		w.document.write(txt);
		w.document.close();
	}

	
	function radEFR_Y() {
		frm = document.forms[0];
		frm.selEfr.disabled=false;
		frm.selAoa.disabled=true;
		frm.txtAOAReason.disabled=true;
	}

	function radEFR_N() {
		frm = document.forms[0];
		frm.selEfr.disabled=true;
		frm.selAoa.disabled=false;
		frm.txtAOAReason.disabled=false;
	}
	
	function radConsent_NR() {
		frm = document.forms[0];
		frm.selConsent.disabled=true;
		frm.txtNumConsents.disabled=true;
	}
	
	function radConsent_R() {
		frm = document.forms[0];
		frm.selConsent.disabled=false;
		frm.txtNumConsents.disabled=false;
	}
	
	function validateSec(ctl) {
		var minval = 1;
		var maxval = 36;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Sec');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Sec is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");     //trim the space 
	    
		return r;
	}
	
	function validateTwp(ctl) {
		var minval = 1;
		var maxval = 126;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Twp');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Twp is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");		//trim the space 
	
		return r;
	}
	
	function validateRge(ctl) {
		var minval = 1;
		var maxval = 30;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Rge');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Rge is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");    //trim the space 
	    
		return r;
	}
	
	function validateMer(ctl) {
		var minval = 4;
		var maxval = 6;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Mer');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Mer is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");   //trim the space 
	
		return r;
	}
	
	function validateToFollow(ctl) {
		var minval = 0;
		var maxval = 75;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('# of Consents to Follow must be a number.');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for # of Consents to Follow is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");   //trim the space 
	
		return r;
	}
	
	function validateLength(ctl) {
		var minval = 0.01;
		var maxval = 999.99;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Transmission length');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Transmission length is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");   //trim the space 
	
		return r;
	}
	
	function validateKilivolts(ctl) {
		var minval = 1;
		var maxval = 10000;
		var r = true;
		
		if (ctl.value.length>0) {
			if (isNaN(ctl.value)) {
				alert('You must fill in a number for Transmission kilovolts');
				r = false;
			} else {
				if ((ctl.value < minval)||(ctl.value > maxval)) {
					alert('The value you entered for Transmission kilovolts is outside the range of ' + minval + " and " + maxval);		
					r = false;
				}
			}
		}
		
		if (!r)
			ctl.value='';
	    ctl.value=ctl.value.replace(/^\s+|\s+$/g,"");   //trim the space 
	
		return r;
	}
	
	function ValidateDeclaration() {
		var r=true;
		var m1='Statutory declaration attachments are not allowed for public work project.';
		var m2='Statutory declaration attachments are not allowed for oil sands project.';
	
		var frm=document.forms[0];  
	    if ((typeof frm.radPublicWork) != "undefined" && (typeof frm.radDeclaration) != "undefined" &&
	        frm.radPublicWork[0].checked && frm.radDeclaration[0].checked ) 
		  { 
		    alert(m1);
		    r = false;
		    frm.radDeclaration[1].checked = true;
		  }
	    if ((typeof frm.radOilSands) != "undefined" && (typeof frm.radDeclaration) != "undefined" &&
	        frm.radOilSands[0].checked && frm.radDeclaration[0].checked ) 
		  { 
		    alert(m2);
		    r = false;
		    frm.radDeclaration[1].checked = true;
		  }	  
		return r;
		
	}
	
	
	//for sr1657 -large land list 
	
	function radLandKind_Y() {
		
	
	       var frm = document.forms[0];
	       if (frm.hidAtsc.value > 0 ) 
	       {
			if (confirm("You have activated the function to 'Upload Land Description File'. All lands entered manually will be lost. Do you wish to continue?")) {
				frm.hidUploadList.value="yes";
				frm.noforward.value="true";
				frm.direction.value="next";
				frm.radLargeLand[0].checked=true;
	            frm.radLargeLand[1].checked=false;			
				if (submitValidation()) {
					frm.submit();
			    }
		    }  else {
		       frm.radLargeLand[0].checked=false;
		       frm.radLargeLand[1].checked=true;
		    }
		  } else {
		        frm.hidUploadList.value="yes";
				frm.noforward.value="true";
				frm.direction.value="next";
				frm.radLargeLand[0].checked=true;
	            frm.radLargeLand[1].checked=false;			
				if (submitValidation()) {
					frm.submit();
			    }
		  }  
		  
	}
	
	function radLandKind_N() {
		var frm = document.forms[0];
			if (confirm("Do you wish to input land descriptions manually?")) {
				frm.hidUploadList.value="no";
				frm.noforward.value="true";
				frm.direction.value="next";
				frm.radLargeLand[0].checked=false;
	            frm.radLargeLand[1].checked=true;						
				if (submitValidation()) {
					frm.submit();
			}
		}   else {
		   frm.radLargeLand[0].checked=true;
		   frm.radLargeLand[1].checked=false;
		}
	}