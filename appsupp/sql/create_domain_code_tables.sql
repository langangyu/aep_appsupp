drop table "CHIEF_DOM"."DOMAIN_NAMES" PURGE;

drop table "CHIEF_DOM"."DOMAIN_CODES" purge;

 create table "CHIEF_DOM"."DOMAIN_NAMES" (
		 	DOMAIN_NAME_ID number(22,0),
			DOMAIN_NAME  varchar2(30),
			APP_CODE varchar2(30),
			DOMAIN_PROMPT varchar2(30),		
			DESCRIPTION  varchar2(30),
			ROLE  varchar2(30),
			CREATE_USERID  varchar2(30) not null,
 			CREATE_TIMESTAMP   timestamp not null,
			UPDATE_USERID  varchar2(30),
 			UPDATE_TIMESTAMP  timestamp 
			)
			;

 create table "CHIEF_DOM"."DOMAIN_CODES" (
		 	DOMAIN_CODE_ID number(22,0),
			CODE  varchar2(30),
			DESCRIPTION varchar2(30),
			DOMAIN_PROMPT varchar2(30),		
			EFFECTIVE_DATE  timestamp,
			TERMINATION_DATE  timestamp,
			DOMAIN_NAME_ID number(22,0),
			CREATE_USERID  varchar2(30) not null,
 			CREATE_TIMESTAMP   timestamp not null,
			UPDATE_USERID  varchar2(30),
 			UPDATE_TIMESTAMP  timestamp 
			)
			;
			
			 
			GRANT  UPDATE,SELECT, INSERT, DELETE ON DOMAIN_NAMES  TO EDS_WLS;
			
			GRANT  UPDATE,SELECT, INSERT, DELETE ON DOMAIN_CODES  TO EDS_WLS;
			
			
		
 			
			
		
 