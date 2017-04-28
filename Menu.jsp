<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  <html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>-->
<html lang="en">
<head>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <!-- <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ShoppingCart</a>
    </div>
    <ul class="nav navbar-nav">
    
   
    
    <c:forEach  var="category" items="${categoryList}">
    
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.name}<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Bhagavad Gita</a></li>
          <li><a href="#">Srimad Bhagavatam</a></li>
          <li><a href="#">Chaitanya Charitamitra</a></li>
        </ul>
      </li>
    </c:forEach>
      
      
      <!-- <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Kids <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Cloth</a></li>
          <li><a href="#">Toys</a></li>
          <li><a href="#">Diapers</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Books <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Prabhupada Books</a></li>
          <li><a href="#">Bhagavad Gita</a></li>
          <li><a href="#">Srimad Bhagavatam</a></li>
        </ul>
      </li> -->
    </ul>
  </div>
</nav>
  


</body>
</html>