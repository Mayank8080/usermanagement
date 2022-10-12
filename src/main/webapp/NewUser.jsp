<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User</title>
<center><h1>NEW USER</h1></center>
</head>
<body>
<form action="ControllerNewUser.htm">
<center><table>
<tr>
<td>UserId</td><br>
<td> : </td>
<td><input type="text" id="userid" name="userid"></td>
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
<td  colspan="3"><center><input type="submit" value="Save"></center></td>
</tr>
</table>
<table cellpadding="10px">
<tr>
<td><center>${user.userId}</center></td>
<td><center>${user.name}</center></td>
<td><center>${user.contactNo}</center></td>
<td><center>${user.gender}</center></td>
<td><center>${user.address}</center></td>
</tr>
</table></center>
</form>
</body>
</html>