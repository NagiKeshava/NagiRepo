<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
 <!--  <link rel="stylesheet" href="resources/css/bootstrap.css">
  <script src="resources/js/bootstrap.js"></script> -->
  
 <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <link rel="stylesheet" href="resources/css/bootstrap.css">
  <script src="resources/js/bootstrap.js"></script> -->
<title>Insert title here</title>
</head>
<body>

 <a href="RegisterPage"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
      <a href="LoginPage"><span class="glyphicon glyphicon-log-in"></span> Login</a>
      
      ${message}
   
     <c:if test="${isUserClickedLogin=='true'}">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${isUserClickedRegister=='true'}">
<jsp:include page="Registration.jsp"></jsp:include>
</c:if>
     
    
<jsp:include page="Menu.jsp"></jsp:include>

<c:if test="${isAdmin=='true'}">
<jsp:include page="admin/AdminHome.jsp"></jsp:include>

</c:if>
<c:if test="${isAdminClickedCategories=='true' }">
<jsp:include page="admin/Category.jsp"></jsp:include>
</c:if>

<c:if test=" ${isAdminClickedSuppliers=='true'}">
<jsp:include page="admin/Supplier.jsp"></jsp:include>
</c:if>
<c:if test="${isAdminClickedProducts=='true' }">
<jsp:include page="admin/Product.jsp"></jsp:include>
</c:if>






<%-- <center><h1>Shopping Cart Web Site</h1></center>
${message}
<hr  color="yellow">
<a href="LoginPage">Login</a>
<a href="RegisterPage">Register</a>

<c:if test="${isUserClickedLogin=='true'}">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${isUserClickedRegister=='true'}">
<jsp:include page="Registration.jsp"></jsp:include>
</c:if> --%>
</body>
</html>