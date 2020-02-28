<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/style.css" rel="stylesheet">
</head>
<body>
  <h1 style="text-align:center">People Data</h1>
  <s:form action="store.asp" modelAttribute="person" method="post">
  	<table>
  		<thead>
  			<tr><th colspan="2" align="center"> Person Form</th></tr>
  		</thead>
  		<tbody>
  			<tr>
  				<td>Sno</td>
  				<td><s:input path="sno"/></td>
  				<td><s:errors path="sno"></s:errors></td>
  			</tr>
  			<tr>
  				<td>Name</td>
  				<td><s:input path="name"/></td>
  				<td><s:errors path="name"></s:errors></td>
  			</tr>
  			<tr>
  				<td>City</td>
  				<td><s:input path="city"/></td>
  				<td><s:errors path="city"></s:errors></td>
  			</tr>
  			<tr>
  				<td colspan="2" align="center">
  					<input type="submit" value="Store Person">
  				</td>
  			</tr>
  		</tbody>
  	</table>
  </s:form>
  <table>
       <thead>
             <tr>
                  <th>Sno</th>
                  <th>Name</th>
                  <th>City</th>
             </tr>
       </thead>
       <tbody>
             <c:forEach items="${people}" var="x">
                <tr>
                     <td> ${x.sno} </td>
                     <td> ${x.name} </td>
                     <td> ${x.city} </td>
                </tr>
             </c:forEach>
       </tbody>
  </table>
</body>
</html>