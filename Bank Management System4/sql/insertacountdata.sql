DELIMITER $$

DROP PROCEDURE IF EXISTS `bmsproject`.`insertAccountdetails` $$
CREATE PROCEDURE `bmsproject`.`insertAccountdetails`(IN accn INT ,IN accname VARCHAR(30),
IN mobno VARCHAR(30),IN adhar VARCHAR(30),IN gen VARCHAR(30),IN ag INT,IN bal DOUBLE)
BEGIN
      INSERT INTO bankaccount (acc_no,acc_name,mob_no,addhar_no,gender,age,balance) values (accn,accname,
      mobno,adhar,gen,ag,bal);
END $$

DELIMITER ;