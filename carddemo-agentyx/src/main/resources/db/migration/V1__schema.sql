-- [agentyx-provenance v1] schema generated from VSAM record layouts

CREATE TABLE IF NOT EXISTS account (
  acct_id BIGINT PRIMARY KEY,
  acct_active_status CHAR(1),
  acct_curr_bal NUMERIC(12,2),
  acct_credit_limit NUMERIC(12,2),
  acct_cash_credit_limit NUMERIC(12,2),
  acct_open_date VARCHAR(10),
  acct_expiraion_date VARCHAR(10),
  acct_reissue_date VARCHAR(10),
  acct_curr_cyc_credit NUMERIC(12,2),
  acct_curr_cyc_debit NUMERIC(12,2),
  acct_addr_zip VARCHAR(10),
  acct_group_id VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS card (
  card_num VARCHAR(16) PRIMARY KEY,
  card_acct_id BIGINT,
  card_cvv_cd BIGINT,
  card_embossed_name VARCHAR(50),
  card_expiraion_date VARCHAR(10),
  card_active_status CHAR(1)
);

CREATE TABLE IF NOT EXISTS card_xref (
  xref_card_num VARCHAR(16) PRIMARY KEY,
  xref_cust_id BIGINT,
  xref_acct_id BIGINT
);

CREATE TABLE IF NOT EXISTS customer (
  cust_id BIGINT PRIMARY KEY,
  cust_first_name VARCHAR(25),
  cust_middle_name VARCHAR(25),
  cust_last_name VARCHAR(25),
  cust_addr_line1 VARCHAR(50),
  cust_addr_line2 VARCHAR(50),
  cust_addr_line3 VARCHAR(50),
  cust_addr_state_cd VARCHAR(2),
  cust_addr_country_cd VARCHAR(3),
  cust_addr_zip VARCHAR(10),
  cust_phone_num1 VARCHAR(15),
  cust_phone_num2 VARCHAR(15),
  cust_ssn BIGINT,
  cust_govt_issued_id VARCHAR(20),
  cust_dob_yyyymmdd VARCHAR(10),
  cust_eft_account_id VARCHAR(10),
  cust_pri_card_holder_ind CHAR(1),
  cust_fico_credit_score BIGINT
);

CREATE TABLE IF NOT EXISTS dis_group (
  id BIGSERIAL PRIMARY KEY,
  dis_acct_group_id VARCHAR(10),
  dis_tran_type_cd VARCHAR(2),
  dis_tran_cat_cd BIGINT,
  dis_int_rate NUMERIC(6,2)
);

CREATE TABLE IF NOT EXISTS security_user (
  sec_usr_id VARCHAR(8) PRIMARY KEY,
  sec_usr_fname VARCHAR(20),
  sec_usr_lname VARCHAR(20),
  sec_usr_pwd VARCHAR(8),
  sec_usr_type CHAR(1),
  sec_usr_filler VARCHAR(23)
);

CREATE TABLE IF NOT EXISTS tran (
  tran_id VARCHAR(16) PRIMARY KEY,
  tran_type_cd VARCHAR(2),
  tran_cat_cd BIGINT,
  tran_source VARCHAR(10),
  tran_desc VARCHAR(100),
  tran_amt NUMERIC(11,2),
  tran_merchant_id BIGINT,
  tran_merchant_name VARCHAR(50),
  tran_merchant_city VARCHAR(50),
  tran_merchant_zip VARCHAR(10),
  tran_card_num VARCHAR(16),
  tran_orig_ts VARCHAR(26),
  tran_proc_ts VARCHAR(26)
);

CREATE TABLE IF NOT EXISTS tran_cat_bal (
  id BIGSERIAL PRIMARY KEY,
  trancat_acct_id BIGINT,
  trancat_type_cd VARCHAR(2),
  trancat_cd BIGINT,
  tran_cat_bal NUMERIC(11,2)
);

CREATE TABLE IF NOT EXISTS tran_type (
  tran_type VARCHAR(2) PRIMARY KEY,
  tran_type_desc VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS dalytran (
  id BIGSERIAL PRIMARY KEY,
  dalytran_id VARCHAR(16),
  dalytran_type_cd VARCHAR(2),
  dalytran_cat_cd BIGINT,
  dalytran_source VARCHAR(10),
  dalytran_desc VARCHAR(100),
  dalytran_amt NUMERIC(11,2),
  dalytran_merchant_id BIGINT,
  dalytran_merchant_name VARCHAR(50),
  dalytran_merchant_city VARCHAR(50),
  dalytran_merchant_zip VARCHAR(10),
  dalytran_card_num VARCHAR(16),
  dalytran_orig_ts VARCHAR(26),
  dalytran_proc_ts VARCHAR(26)
);
