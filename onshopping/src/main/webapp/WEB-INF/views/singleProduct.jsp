<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/> 
<div class="container">

	<!-- Breadcrumb -->
	<div class="row">

		<div class="col-xs-12">


			<ol class="breadcrumb">

				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/show/all/products">Products</a></li>
				<li class="active">${product.name}</li>

			</ol>
		</div>
	</div>


	<div class="row">

		<!-- Display the product image -->
		<div class="col-xs-12 col-sm-4">

			<div class="thumbnail">

				<img src="${images}/${product.code}.jpg" class="img img-responsive" />

			</div>

		</div>


		<!-- Display the product description -->
		<div class="col-xs-12 col-sm-8">

			<h3>${product.name}</h3>
			<hr />

			<p>${product.description}</p>
			<hr />

			<h4>
				Price: <strong> &#8377; ${product.unitPrice} /-</strong>
			</h4>
			<hr/>
		<%-- 	
			<h6>
				Qty. Available:${product.quantity}
			</h6> --%>

			<!--for Views-->
			<c:choose>
				<c:when test="${product.quantity<1}">
					<h6>
						Qty. Available:<span style="color:red">Out of Stock...!! </span>
					</h6>
				</c:when>
				<c:otherwise>
					Qty. Available:${product.quantity}
				</c:otherwise>
			</c:choose>


				<!--for Cart-->
			<c:choose>
				<c:when test="${product.quantity<1}">
					<h6>
						<a href="javascript:void(0)" class="btn btn-success disabled"><strike>
						<span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</strike></a>
					</h6>
				</c:when>
				<c:otherwise>				
					<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success">
					<span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</a>					
				</c:otherwise>
			</c:choose>	

					<a href="${contextRoot}/show/all/products" class="btn btn-primary">
				Back</a>
					
				
					
	   </div>
</div>

	
</div>
	   
			