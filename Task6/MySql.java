Create Table EmployeeDetails (
empno int ,
ename varchar(50),
job varchar(50),
mgr int,
hiredate date,
sal decimal(10,2),
comm decimal(10,2),
deptno int
) ;

Insert into EmployeeDetails (empno,ename,job,mgr,hiredate,sal,comm,deptno)
value
(8369,'SMITH','CLERK','8902','1990-12-18',800.00,NULL,20),
(8499,'ANYA','SLAESMAN','8698','1991-02-20',1600.00,'300.00',30),
(8521,'SETH','SLAESMAN','8698','1991-02-22',1250.00,'500.00',30),
(8566,'MAHADEVAN','MANAGER','8839','1991-04-02',2985.00,NULL,20),
(8654,'MOMIN','SLAESMAN','8698','1991-09-28',1250.00,'1400.00',30),
(8698,'BINA','MANAGER','8839','1991-05-01',2850.00,NULL,30),
(8882,'SIVANSH','MANAGER','8839','1991-06-09',2450.00,NULL,10),
(8888,'SCOTT','ANALYST','8566','1992-12-09',3000.00,NULL,20),
(8839,'AMIR','PRESIDENT',null,'1991-11-18',5000.00,NULL,10),
(8844,'KULDEEP','SALESMAN','8698','1991-09-08',1500.00,0.00,30);
Select * from employeeDetails;
Select ename as EmpName ,
sal as Salary from EmployeeDetails where sal >= 2200;

Select * from EmployeeDetails where comm IS null;

Select ename as Employeename , sal as salary from EmployeeDetails where sal not between 2500 and 4000;

Select ename as Name,job as JobTitle,sal as Salary from EmployeeDetails where job != 'MANAGER';

Select ename as EmployeeName  from EmployeeDetails where substring(ename,3,1) ='A';

Select ename as EmployeeName  from EmployeeDetails where ename like '%T';



