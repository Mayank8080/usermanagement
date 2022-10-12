<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
<center><h1>UPDATE USER</h1></center>
</head>
<body>
<form action="ControllerUpdateUser.htm">
<center><table>
<tr>
<td>UserId</td>
<td> : </td>
<td><input type="text" id="userid" name="userid" placeholder="Enter user id you want to change"></td>
</tr>
<tr>
<td>Name</td>
<td> : </td>
<td><input type="text" id="name" name="name"></td>
</tr>
<tr>
<td>Contact No.</td>
<td> : </td>
<td><input type="text" id="contactno" name="contactno"></td>
</tr>
<tr>
<td>Gender</td>
<td> : </td>
<td><input type="text" id="gender" name="gender"></td>
</tr>
<tr>
<td>Address</td>
<td> : </td>
<td><input type="text" id="address" name="address"></td>
</tr>
<tr><td> </td><td></td><td></td></tr>
<tr><td> </td><td></td><td></td></tr>
<tr>
<td  colspan="3"><center><input type="submit" value="Update"></center></td>
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