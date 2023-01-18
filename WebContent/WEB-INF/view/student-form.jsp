<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>

	<title>학생 등록 폼</title>


</head>


<body>

	<!-- 폼이 로드 되면 스프링MVC가 student.getFirstName 를 호출한다 
	그리고 폼이 제출되면 student.setFirstName을 호출한다 -->
	
	
	<form:form action = "processForm" modelAttribute="student">
	
	First name : <form:input path ="firstName"/>
	
	<br><br>
	
	last name : <form:input path ="lastName"/>
	
	<br><br>
	
	Country:
	<form:select path="country">
	
		<form:options items="${student.countryOptions }"/>
		
	</form:select>
	
	
	<input type="submit" value = "Submit"/>
	
	</form:form>

</body>



</html>