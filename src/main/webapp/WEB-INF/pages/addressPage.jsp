<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--provide an html table start tag -->
<table style="border: 1px solid;">
	<!-- iterate over the collection using forEach loop -->
	<c:forEach var="address" items="${addresses}">
		<!-- create an html table row -->
		<tr>
			<!-- create cells of row -->
			<td>${address.id }</td>
			<td>${address.country}</td>
			<td>${address.city}</td>
			<td>${ address.street}</td>
			<!-- close row -->
		</tr>
		<!-- close the loop -->
	</c:forEach>
	<!-- close table -->
</table>