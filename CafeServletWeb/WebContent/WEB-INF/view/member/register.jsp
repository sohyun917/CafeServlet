<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<link rel="stylesheet" href="/resources/css/register.css">
		
	</head>
	<body>
		<div id="container">
			<div id="header">
				<h2>회원가입 후 이용해주세요</h2>
				<h3>회원정보를 입력하세요</h3>			
			</div>		
			<div id="main">
				<form action="/member/registerView.sso" method="post">
					<fieldset>
						<legend>회원가입</legend>
						<ul>
							<li>
								<label for="member-id">아이디</label>
								<input type="text" id="member-id" name="member-id">
							</li>
							<li>
								<label for="member-pw">비밀번호</label>
								<input type="password" id="member-pw" name="member-pw">
							</li>
							<li>
								<label for="member-name">이름</label>
								<input type="text" id="member-name" name="member-name">
							</li>
							<li>
								<label for="member-age">나이</label>
								<input type="text" id="member-age" name="member-age">
							</li>
							<li>
								<label for="member-email">이메일</label>
								<input type="email" id="member-email" name="member-email">
							</li>
							<li>
								<label for="member-phone">전화번호</label>
								<input type="tel" id="member-phone" name="member-phone">
							</li>
						</ul>
					</fieldset>
					<div id="buttonTag">
						<input type="submit" value="회원가입" class="button">
						<input type="reset" value="초기화" class="button">
					</div>
				</form>
			</div>
		</div>
	</body>
</html>