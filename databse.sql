create database HDFC_DB;

use HDFC_DB;

create table Employee (
	employee_id int PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(255),
    date_of_birth DATE
);

show tables;

desc employee;

insert into employee ( employee_name, date_of_birth) values 
('Bharath Kumar', '1999-03-27'),
('Naveen Goud', '2000-09-14'),
('Praveen Kumar', '2001-03-01'),
('Ajay Kumar', '1995-12-14'),
('Hasini', '2000-05-24'),
('Venkat Reddy', '1997-05-17'),
('Sai Boora', '1998-06-06'),
('Akshay', '1996-11-13'),
('Vinay', '1998-04-24');

select * from employee;

