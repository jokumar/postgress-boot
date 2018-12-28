CREATE TABLE employee
(
 employeeName varchar(100) NOT NULL,
  employeeId varchar(11) NOT NULL ,
 employeeAddress varchar(100) DEFAULT NULL,
 employeeEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (employeeId)
);