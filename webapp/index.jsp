<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Action Page</title>
</head>
<body>

	<s:form action="hello">
		<s:fielderror/>
		<s:textfield name="personBean.name" label="Tell me your name" labelSeparator="" placeHolder="Name"/>
		<s:submit value="Submit" />
	</s:form>

</body>
</html>