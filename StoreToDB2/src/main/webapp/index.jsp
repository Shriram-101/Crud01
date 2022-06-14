<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>My First JSP</title>
</head>
<body>
<h3> Update to database </h3>

<form action=/addUser>

Employe ID : <input type = "text" name = "empNo"> <br>
Name : <input type = "text" name = "name"> <br>
Salary : <input type = "text" name = "salary"> <br>

<br>
<input type = "submit"> <br>
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
</form>

<h3> Retrieve from Database </h3>
<form action=/displayUser>

Employe ID : <input type = "text" name = "empNo"> <br>

<br>
<input type = "submit"> <br>
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
</form>

</form>

<h3> Delete from database </h3>
<form action=/deleteUser>

Employe ID : <input type = "text" name = "empNo"> <br>

<br>
<input type = "submit"> <br>
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
</form>

<h3> Update to database </h3>
<form action=/updateUser>

Employe ID : <input type = "text" name = "empNo"> <br>

<br>
<input type = "submit"> <br>
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
</form>

</body>
</html>