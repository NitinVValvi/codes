DELIMITER $$

DROP PROCEDURE IF EXISTS `bmsproject`.`depositmoneyintoaccount` $$
CREATE PROCEDURE `bmsproject`.`depositmoneyintoaccount`(IN accn int,IN bal DOUBLE)
BEGIN
    UPDATE bankaccount SET balance= bal + balance WHERE acc_no = accn;
END $$

DELIMITER ;