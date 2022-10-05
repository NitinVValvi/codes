DELIMITER $$

DROP PROCEDURE IF EXISTS `bmsproject`.`withdrawmoneyfromaccount` $$
CREATE PROCEDURE `bmsproject`.`withdrawmoneyfromaccount`(IN accn int,IN bal DOUBLE)
BEGIN
     UPDATE bankaccount SET balance= balance-bal WHERE acc_no = accn;
END $$

DELIMITER ;