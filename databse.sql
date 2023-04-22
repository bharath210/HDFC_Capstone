create database hdfc_db;

use hdfc_db;

create table Employee (
	employee_id int PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(255),
    date_of_birth DATE
);

show tables;
desc employee;
insert into employee ( employee_name, date_of_birth) values ('Bharath Kumar', '1999-03-27');
select * from employee;
insert into employee ( employee_name, date_of_birth) values ('Naveen', '1999-09-14');

show databases;
show tables;
