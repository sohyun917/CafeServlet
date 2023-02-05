<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>In&Out</title>
		<link rel="stylesheet" href="/resources/css/inout.css">
	</head>
	<body>
		<div id="container">
			<div id="header">
				<h1>입출고내역</h1>
				<h3>입출고내역을 작성해주세요</h3>
			</div>
				<form action="/cafeinven/inout.sso" method="post">
			<div id="main">
				<label for="sname">상품명</label>
				<input type="text" name="sname" id="sname">
				<label for="inout">입출고수량</label>
				<input type="text" name="inout" id="inout"><br>
				<input type="submit" value="입력완료">
				<input type="reset" value="초기화">
			</div>
				</form>
		</div>
	</body>
</html>