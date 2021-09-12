SELECT email, phone_number FROM employees
WHERE phone_number IS NOT NULL AND
department_id IN (SELECT department_id FROM departments
                       WHERE location_id IN (SELECT location_id FROM locations
                                            WHERE country_id IN (SELECT country_id FROM countries
                                                                WHERE region_ID = 1)))

SELECT * FROM dependents
WHERE employee_id IN (SELECT employee_id FROM employees
                      WHERE salary = (SELECT MAX (salary) from employees))
                      

SELECT country_name, SUM(salary) FROM countries
INNER JOIN locations ON countries.country_id = locations.country_id
INNER JOIN departments ON locations.location_id = departments.location_id
INNER JOIN employees ON departments.department_id = employees.department_id
GROUP BY countries.country_name
ORDER BY SUM(employees.salary) DESC 
