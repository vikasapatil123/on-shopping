<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
    	<div class="containe">
  			<div class="row">	 
  				<div class="col-xs-12">
  					<div class="jumbotron">
  						<h1>${errorTitle}</h1>
  						<hr/>
  						<blockquote>${errorDescription}</blockquote>
  						<hr/>
  						<h1>${title}</h1>
  						<hr/>
  					</div>
  			
  				</div>
  			
  	 		</div>
  	 	</div>
  
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
  
  
  <!-- Loading only when click on Contact us -->
  <c:if test="${userClickContact==true}">
  <%@include file="contact.jsp" %>
  </c:if>
  
   <!-- Loading only userClickCategoryProducts or userClickAllProducts -->
   
  <c:if test="${userClickCategoryProducts == true or userClickAllProducts == true}">
  <%@include file="listProducts.jsp" %>
  </c:if>
  
   <!-- Loading only userClickShowProduct -->
  
  <c:if test="${userClickShowProduct == true}">
  <%@include file="singleProduct.jsp" %>
  </c:if>
 
			
			
			
  
  </div>
  
  
  <!-- /.container -->

  <!-- Footer -->
 
 <%@include file="./shared/footer.jsp" %>

	</div>
	
</body>

</html>

 --%>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">


<title>Online Shopping - ${title}</title>

</head>

<body>

	<div class="wrapper">

	    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	        <div class="container">
	            <!-- Brand and toggle get grouped for better mobile display -->
	            <div class="navbar-header">
	                <a class="navbar-brand" href="${contextRoot}/home">Home</a>
	            </div>
			</div>
		</nav>
			
		
		<div class="content">
		
			<div class="container">
			
				<div class="row">
				
					<div class="col-xs-12">
					
						
						<div class="jumbotron">
						
							<h1>${errorTitle}</h1>
							<hr/>
						
							<blockquote style="word-wrap:break-word">
								
								${errorDescription}
							
							</blockquote>						
						
						</div>
						
											
					</div>					
				
				</div>
			
			</div>
							
		</div>

		
		<%@include file="./shared/footer.jsp" %>

	</div>
		
	
</body>


</html>