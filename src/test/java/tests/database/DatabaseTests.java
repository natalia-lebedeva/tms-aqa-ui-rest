package tests.database;

public class DatabaseTests {
    /*
    ____________________________________________Задание 1_______________________________________________
1 SELECT * FROM Customers
  WHERE City = 'London';

2 SELECT CustomerName, ContactName FROM Customers
  WHERE Address LIKE '%23';

3 SELECT DISTINCT City FROM Customers;

4 SELECT * FROM Customers
  WHERE PostalCode LIKE '0%';

5 SELECT CustomerName FROM Customers
  WHERE Country != 'USA';

6 SELECT * FROM Customers
  WHERE Country = 'France'
  ORDER BY ContactName DESC;

7 SELECT * FROM Customers
  WHERE Country = 'Germany' or Country = 'USA'
  LIMIT 10;

    ____________________________________________Задание 2_______________________________________________
1 SELECT * FROM Products
    WHERE ProductName LIKE 'M%';

2 SELECT Unit FROM Products
    WHERE ProductName = 'Steeleye Stout';

3 SELECT ProductName,Price FROM Products
    WHERE Price > 22;

4 SELECT ProductName, Unit FROM Products
    WHERE Unit LIKE '%500 g%';

5 SELECT ProductName, Unit FROM Products
    WHERE Unit LIKE '%bottles%';

6 SELECT ProductName,SupplierID,Price FROM Products
    WHERE SupplierID = 7
    ORDER BY Price DESC;

     ____________________________________________Задание 3_______________________________________________
    SELECT * FROM character
    WHERE  level > 45 and race = 'dwarf' ;
     ____________________________________________Задание 4_______________________________________________
1 SELECT LastName,FirstName,Notes FROM Employees
    WHERE LastName = 'Leverling';
2 SELECT * FROM Employees
    WHERE BirthDate > '1960-12-31';
3 SELECT BirthDate,FirstName FROM Employees
    WHERE FirstName LIKE 'A%';
4 SELECT FirstName,LastName,BirthDate FROM Employees
    ORDER BY BirthDate ASC;

    */
}
