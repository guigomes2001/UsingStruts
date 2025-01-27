<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Hello Page</title>
</head>
<body>

	<h2>Hello, <s:property value="personBean.name"/></h2>
	
	<input value="Back" type="submit" onclick="window.location.href='index.jsp'"/>
</body>
</html>