<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>

	<title>student-form</title>


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
	
	<br><br>
	Favorite Language: 
	
	Java: <form:radiobutton path="favoriteLanguage" value="java"/>
	C#: <form:radiobutton path="favoriteLanguage" value="C#"/>
	PHP: <form:radiobutton path="favoriteLanguage" value="PHP"/>
	Ruby: <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	
	
	<br><br>
	
	<!-- 제출 시 student.setOpatingSystems를 호출한다 -->
	Operating Systems: 
	
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS <form:checkbox path="operatingSystems" value="Mac Os"/>
	MS Windows <form:checkbox path="operatingSystems" value="MS windows"/>
	
	<br><br>
	
	<input type="submit" value = "Submit"/>
	
	</form:form>

</body>



</html>