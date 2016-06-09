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
