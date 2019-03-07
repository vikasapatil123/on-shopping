<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/> --%>

<div class="container">

	<!--display sidebar  -->
	<div class="col-md-3">
		<%@ include file="./shared/sidebar.jsp"%>
	</div>
  
	<!--display actual products  -->
	<div class="col-md-9">
		<!--Added Breadcrumb components  -->
		<div class="row">
			<div class="col-lg-12">

				<c:if test="${userClickAllProducts == true}">
					<script>
						window.categoryId ='';
					</script>
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>


					<c:if test="${userClickCategoryProducts == true}">
					<script>
						window.categoryId = '${category.id}';
					</script>

					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
				</c:if>



				<%-- <c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>					
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>


						</ol>
					</c:if> --%>








			</div> 
		</div>
		
		<div class="row">
			<div class="col-xs-12">
					<table id="productListTable" class="table table-striped table-borderd">
					
					<thead>
						<tr>
							<th></th>
							<th>Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th>Qty. Available</th>
							<th></th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th></th>
							<th>Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th>Qty. Available</th>
							<th></th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
		
	
		
	</div>
</div>