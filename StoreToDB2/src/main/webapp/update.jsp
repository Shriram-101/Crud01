
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>My First JSP</title>
</head>
<body>
<form action=/addUser>


Employe ID : <input type = "text" name = "empNo" value = "${update.empNo}"> <br>
Name : <input type = "text" name = "name" value = "${update.name}"> <br>
Salary : <input type = "text" name = "salary" value = "${update.salary}"> <br>

<br>
<input type = "submit"> <br>

</body>
</html>