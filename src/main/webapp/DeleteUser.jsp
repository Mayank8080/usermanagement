<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove User</title>
<center><h1>DELETE USER</h1></center>
</head>
<body>
<form action="ControllerDeleteUser.htm">
<center><table>
<tr>
<td>UserId</td>
<td> : </td>
<td><input type="text" id="userid" name="userid" placeholder="Enter user id you want to delete"></td>
</tr>
<tr><td> </td><td></td><td></td></tr>
<tr><td> </td><td></td><td></td></tr>
<tr>
<td  colspan="3"><center><input type="submit" value="DELETE "></center></td>
</tr>
</table></center>
<table cellpadding="10px">
<tr>
<td><center>${user.userId}</center></td>
<td><center>${user.name}</center></td>
<td><center>${user.contactNo}</center></td>
<td><center>${user.gender}</center></td>
<td><center>${user.address}</center></td>
</tr>
</table>
</form>
</body>
</html>
</html>