<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>CafeInventoryProgram</title>
		<link rel="stylesheet" href="/resources/css/main.css">
	</head>
	<body>
		<div id="container">
			<div id="header">
				<h1>Sso Cafe Inventory Program</h1>
				<c:if test="${sessionScope.memberId ne null }">
				<span id="member-id-span">${sessionScope.memberId }</span>님 환영합니다!
				</c:if>
			</div>
			<div id="main">
				<div id="mainLeft">
					<div id="menu">
						<a href="/cafeinven/stock.sso">Stock</a>
						<a href="/cafeinven/inout.sso">In&Out</a>
						<a href="#">Order</a>
						<a href="/member/registerView.sso">Join Us</a>
					</div>
					<div class="product">
						<fieldset class="product">
							<legend>상품소개</legend>
						</fieldset>
					</div>
				</div>
				<div id="mainRight">
					<fieldset>
						<legend>Login</legend>
						<form action="/member/login.sso" method="post">
							<input type="text" name="member-id" placeholder="아이디" class="login"><br>
							<input type="password" name="member-pw" placeholder="비밀번호" class="login"><br>
							<input type="submit" value="로그인">		
							<input type="reset" value="취소">				
						</form>
					</fieldset>
				</div>
			</div>
		</div>
	</body>
</html>