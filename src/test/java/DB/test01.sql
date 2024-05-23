select FIRST_NAME from Employees
order by first_name asc;


select distinct(FIRST_NAME) from (select FIRST_NAME from Employees
                                  order by first_name asc)
order by FIRST_NAME asc;

