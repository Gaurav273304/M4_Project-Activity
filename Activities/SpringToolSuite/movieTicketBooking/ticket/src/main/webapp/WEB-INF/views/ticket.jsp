<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert-booking" method ="post">
Mobile:<input type ="text" name ="mobile"><br>
Show Date:<input type ="date" name ="showdate"><br>
Show Time:<select name =" Showtime" >
<option value = "10:45:00">Morning</option>
</select><br><br>
No of tickets:<input type = "number" name ="number of tickets"><br>
<input type ="submit" value ="Book">
</form>
</body>
</html>