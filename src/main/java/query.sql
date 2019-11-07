SELECT OrderDate
FROM Orders
GROUP BY OrderDate
ORDER BY AVG(Price) desc
LIMIT 1