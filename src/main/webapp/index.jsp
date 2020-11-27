<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
<h2>Add User!</h2>
<form action="adduser" method="post">
	<input name="uid" placeholder="User Id" type="text">
	<input name="uname" placeholder="User Name" type="text">
	<input name="Submit" type="submit">
</form>
<hr>
<form action="finduser" >
	<label for="uname">Type user name to search:-</label>
	<input name="uname" placeholder="Username" type="text">
	<input name="Submit" type="submit">
</form>
</body>
</html>
