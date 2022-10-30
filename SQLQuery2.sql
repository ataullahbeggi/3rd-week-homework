--Select Seçme işlemi
--ANSII
Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers 

Select * from Customers where City = 'Berlin'  --Metinler ' (tek tırnak) ile yazılır

--case insensitive büyük küçük harf duyarsız
Select * from Products where CategoryID =1 or CategoryID=3

Select * from Products where CategoryID =1 and UnitPrice>=10

Select * from Products where CategoryID=1 order by UnitPrice desc   -- asc  ascending  artan, default olarak gelir  --cesc  descending  azalan

Select Count(*) Adet from Products where CategoryID=2

Select CategoryID, count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10 --önce her zaman where çalışır

Select Products.ProductID,Products.ProductName, Products.UnitPrice,Categories.CategoryName
from Products inner join Categories -- hem products hem de categorilerin bir araya gelmesi
on Products.CategoryID=Categories.CategoryID --koşul producttaki catId ile kategorilerdeki catId eşitse
where Products.UnitPrice>10 

-- inner join sadece iki tabloda da eşleşenleri bir araya getirir, eşlemeyen dataları getirmez
--DTO Data Transformation Object

Select * from Products p inner join [Order Details] od  -- left join solda olup sağda olmayanları da getirir
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID

Select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null