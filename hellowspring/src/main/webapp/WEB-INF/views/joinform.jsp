<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입폼</title>
<style>
input{
display:block;
margin-top:10px;
}
</style>
</head>
<body>
	<form action="<%=request.getContextPath() %>/user/join" /*넘겨 주는 주소  (받는곳 주소)*/
	method="POST">
	<input type="text" name="name" placeholder="이름"/>
	<input type="text" name="email" placeholder="이메일"/>
	<input type="password" name="password" placeholder="비밀번호"/>
	<input type="text" name="gender" placeholder="성별"/>
	<input type="text" name="age" placeholder="나이"/>
	
	<input type="submit" value="가입"/>
	</form>
</body>
</html>