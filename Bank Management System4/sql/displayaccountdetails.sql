DELIMITER $$

DROP PROCEDURE IF EXISTS `bmsproject`.`displayaccountdetails` $$
CREATE PROCEDURE `bmsproject`.`displayaccountdetails`(in acn int,out nm varchar(30),out mobno varchar(30),out addhar varchar(30), out gen varchar(30), out ag int, out bal double)
BEGIN
  select acc_no,acc_name,mob_no,addhar_no,gender,age,balance into acn,nm,mobno,addhar,gen,ag,bal from bankaccount where acc_no = acn;
END $$

DELIMITER ;