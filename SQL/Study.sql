-- DDL - Create, Alter, Drop, Truncate and Rename

create database scaler1;
create database scaler2;

create table myTable1(
cone int,
ctwo varchar(25)
);

create table myTable2(
name varchar(10)
);

-- ---------------------------------------------------------
-- MISCELLANIOUS
use scaler1;
SHOW TABLES;

-- ---------------------------------------------------------
-- DROP DATABASE AND TABLES

drop database scaler2;
drop table myTable2;

-- ---------------------------------------------------------
-- ALTER

-- ADD
ALTER TABLE myTable1 ADD addedColumn1 int;

-- To change the property of the column
ALTER TABLE myTable1 MODIFY addedColumn1 VARCHAR(20);

ALTER TABLE myTable1 ADD addedColumn2 int;

-- DROP
ALTER TABLE myTable1 DROP COLUMN addedColumn2;

-- TRUNCTAE
TRUNCATE TABLE myTable2;

-- RENAME
RENAME TABLE myTable1 TO modifiedTable1;

-- ================================================================================================================================================
-- DQL

SELECT * FROM myTable1;
SELECT * FROM myTable2;

