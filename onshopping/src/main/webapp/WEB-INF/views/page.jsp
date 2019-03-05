<%-- <%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en"> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="vikas patil">
  <meta name="_csrf" content="${_csrf.token}">
  <meta name="_csrf_header" content="${_csrf.headerName}">

  <title>Online Shopping ${title}</title>
  
  <script>
  window.menu = '${title}';	
	window.contextRoot = '${contextRoot}'
  
  </script>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
  
  <!-- Bootstrap readable theme -->
  <link href="${css}/bootstap-readable-theme.css" rel="stylesheet">
  
  <!-- Bootstrap data table -->
  <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
  

  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

  <div class="wrapper">
  <!-- Navigation -->
  <%@include file="./shared/navbar.jsp" %>

  <!-- Page Content -->
  <div class="content">
  
  <!-- Loading only when click on Home  -->
  <c:if test="${userClickHome==true}">
  <%@include file="home.jsp" %>
  </c:if>
  
   <!-- Loading only when click on About -->
  <c:if test="${userClickAbout==true}">
  <%@include file="about.jsp" %>
  </c:if>
  
   <!-- Loading only when click on Contact us -->
  <c:if test="${userClickContact==true}">
  <%@include file="contact.jsp" %>
  </c:if>
  
  
<%--   <!-- Loading only when click on Contact us -->
  <c:if test="${userClickContact==true}">
  <%@include file="contact.jsp" %>
  </c:if> --%>
  
   <!-- Loading only userClickCategoryProducts or userClickAllProducts -->
   
  <c:if test="${userClickCategoryProducts == true or userClickAllProducts == true}">
  <%@include file="listProducts.jsp" %>
  </c:if>
 
			
  
  </div>
  
  
  <!-- /.container -->

  <!-- Footer -->
 
 <%@include file="./shared/footer.jsp" %>
 
 <!--JQuery  -->
   <script src="${js}/jquery.js"></script>
 
  <!-- Bootstrap core JavaScript -->
  <script src="${js}/bootstrap.js"></script>
<%--   <script src="${js}/bootstrap.bundle.min.js"></script> --%>

<!--Data tables  -->
   <script src="${js}/jquery.dataTables.js"></script> 
  
  <!--Data tables Bootstrap scripts  -->
   <script src="${js}/dataTables.bootstrap.js"></script> 
  
  <!-- Self coded java script -->
  <script src="${js}/myapp.js"></script>
  
  <!-- DataTable Bootstrap Script -->
		<script src="${js}/bootbox.min.js"></script>

<%-- 	<script src="${js}/bootstrap.bundle.min.js"></script> --%>
	
	
	
	
	
<%-- 	<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<script src="${js}/jquery.validate.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		
		<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- DataTable Bootstrap Script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
		
		<!-- DataTable Bootstrap Script -->
		<script src="${js}/bootbox.min.js"></script>
		
		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script> --%>
	
	
	
	
	
	
	
	
	
	
	
	</div>
	
</body>

</html>

