<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Stock</title>
	</head>
	<body>
		<div id="container">
			<div id="header">
				<h2>재고내역을 확인하세요.</h2>
			</div>
			<div id="main">
				<form action="/cafeinven/stock.sso" method="post">
					<fieldset>
						<legend>재고내역</legend>
						<ul>
							<li>
							제품명
							<input type="text" id="sname" name="sname" value="${cafeInven.name }" readonly>
							</li>
							<li>
							입출고수량
							<input type="text" id="inout" name="inout" value="${cafeInven.inoutStock }" readonly>
							</li>
							<li>
							입출고날짜
							<input type="text" id="inoutTime" name="inoutTime" value="${cafeInven.inoutTime }" readonly>
							</li>
						</ul>
					</fieldset>
				</form>
			</div>
		</div>
	</body>
</html>